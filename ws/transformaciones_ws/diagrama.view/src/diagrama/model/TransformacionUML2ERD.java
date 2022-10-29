package diagrama.model;

import abstracta.MBSClase;
import abstracta.ModelFactory;
import sql_metamodel.Column;
import sql_metamodel.PrimaryKey;
import sql_metamodel.Schema;
import sql_metamodel.Sql_metamodelFactory;
import sql_metamodel.Table;

public class TransformacionUML2ERD {
	
	private abstracta.ModelFactory modelFactoryAbstracta;
	private sql_metamodel.ModelFactory modelFactorySQL;
	
	public TransformacionUML2ERD(ModelFactory modelFactoryAbstracta, sql_metamodel.ModelFactory modelFactorySQL) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.modelFactorySQL = modelFactorySQL;
	}
	
	public String transformarUMLToERD() {
		
		String mensaje = "Se ha realizado la transformacion Uml2Erd";
		
		if(modelFactorySQL.getListSchemas().size()>0) {
			
			modelFactorySQL.getListSchemas().clear();
		}
		
		if(modelFactorySQL.getListAllTables().size()>0) {
			
			modelFactorySQL.getListAllTables().clear();
		}
		
		//Crear el Schema
		Schema schema = crearSchema();
		
		if(schema != null) {
			
			for(abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
				
				//Crea las tablas
				crearTabla(clase, schema.getName());
			}
			
			for(abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
				
				if(clase.getAtributos().size()>0) {
					
					for(abstracta.MBSAtributo atributo : clase.getAtributos()) {
						
						//Crea el atributo
						crearAtributos(clase.getNombre(), schema.getName(), atributo);
					}
				}
				
			}
			
		}else {
			
			mensaje = "Debe crear un modelo abstracto primero antes de hacer esta transformación";
		}
		
		return mensaje;
	}
	
	private sql_metamodel.Schema crearSchema(){
		
		if(modelFactoryAbstracta.getListaPaquetes().size()>0) {
			
			Schema newSchema = Sql_metamodelFactory.eINSTANCE.createSchema();
			newSchema.setName(modelFactoryAbstracta.getListaPaquetes().get(0).getNombre());
			modelFactorySQL.getListSchemas().add(newSchema);
			
			return newSchema;
		}
		
		return null;
	}
	
	private void crearTabla(abstracta.MBSClase claseAbstracta, String nombreSchema){
		
		Table newTable = obtenerTabla(claseAbstracta.getNombre(), nombreSchema);
		
		if(newTable == null) {
			
			newTable = Sql_metamodelFactory.eINSTANCE.createTable();
			newTable.setName(claseAbstracta.getNombre());
			modelFactorySQL.getListSchemas().get(0).getListTables().add(newTable);
			modelFactorySQL.getListAllTables().add(newTable);
		}
	}
	
	private void crearAtributos(String nombreTabla, String nombreSchema, abstracta.MBSAtributo atributo) {
		
		Table tabla = obtenerTabla(nombreTabla, nombreSchema);
		
		if(tabla != null) {
			
			if(atributo.getIsPrimaryKey()) {
				
				PrimaryKey primaryKeyTabla = crearPrimaryKey(atributo);
				
				tabla.getListPrimaryKeys().add(primaryKeyTabla);
			}else {
				
				Column newColumn = Sql_metamodelFactory.eINSTANCE.createColumn();
				
				newColumn.setName(atributo.getNombre());
				newColumn.setIsNotNull(atributo.getIsNotNull());
				newColumn.setIsAutoIncremetable(atributo.getIsAutoincrementable());
				
				if(atributo.getTipo().equals("String")) {
					
					newColumn.setType("varchar(100)");
				}else if(atributo.getTipo().equals("Int")) {
					
					newColumn.setType("integer");
				}else{
					
					newColumn.setType(atributo.getTipo());
				}
			}
		}
	}
	
	private sql_metamodel.Schema obtenerSchema(String nombreSchema){
		
		if(modelFactorySQL.getListSchemas().size()>0) {
			
			if(modelFactorySQL.getListSchemas().get(0).getName().equals(nombreSchema)) {
				
				return modelFactorySQL.getListSchemas().get(0);
			}
		}
		
		return null;
	}
	
	private sql_metamodel.Table obtenerTabla(String nombreTabla, String nombreSchema){
		
		Schema schema = obtenerSchema(nombreSchema);
		
		if(schema!=null) {
			
			for(Table table : schema.getListTables()) {
				
				if(table.getName().equals(nombreTabla)) {
					
					return table;
				}
			}
		}
		
		return null;
	}
	
	private abstracta.MBSClase obtenerClaseAbstracta(String nombre) {
		
		for(MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
			
			if(clase.getNombre().equals(nombre)) {
				
				return clase;
			}
		}
		
		return null;
	}
	
	private sql_metamodel.PrimaryKey crearPrimaryKey(abstracta.MBSAtributo atributo){
		
		sql_metamodel.PrimaryKey primaryKey = Sql_metamodelFactory.eINSTANCE.createPrimaryKey();
		
		primaryKey.setName(atributo.getNombre());
		primaryKey.setIsAutoIncremetable(atributo.getIsAutoincrementable());
		primaryKey.setIsNotNull(atributo.getIsNotNull());
		
		if(atributo.getTipo().equals("String")) {
			
			primaryKey.setType("varchar(10)");
		}else if(atributo.getTipo().equals("Int")) {
			
			primaryKey.setType("integer");
		}else{
			
			primaryKey.setType(atributo.getTipo());
		}
		
		return primaryKey;
	}
}
