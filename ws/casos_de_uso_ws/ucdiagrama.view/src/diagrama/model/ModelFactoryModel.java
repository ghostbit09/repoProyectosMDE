package diagrama.model;

import ucdiagram.UcdiagramFactory;
import ucdiagram.UcdiagramPackage;
import ucdiagram.ModelFactory;

public class ModelFactoryModel {
	
	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	//------------------------------  Singleton ------------------------------------------------
	private ModelFactory modelFactoryUcDiagrama;
	
	public ModelFactoryModel() {
	}

	public ModelFactory cargarUcDiagrama() {
		ModelFactory modelFactory = null;

		UcdiagramPackage whoownmePackage =  UcdiagramPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/"+"model.ucdiagram");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
	}

	public void generarModelToDoc() {
		
		modelFactoryUcDiagrama = cargarUcDiagrama();
		TransformacionM2D transformacionM2D = new TransformacionM2D(modelFactoryUcDiagrama);
		transformacionM2D.transformarM2D();
	}

}
