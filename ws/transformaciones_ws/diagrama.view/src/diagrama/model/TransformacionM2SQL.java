package diagrama.model;

import java.io.File;
import java.io.FileWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import sql_metamodel.ForeignKey;
import sql_metamodel.ModelFactory;
import sql_metamodel.PrimaryKey;
import sql_metamodel.Table;

public class TransformacionM2SQL {
	
	private sql_metamodel.ModelFactory modelFactorySQL;

	public TransformacionM2SQL(ModelFactory modelFactorySQL) {
		super();
		this.modelFactorySQL = modelFactorySQL;
	}
	
	public String transformarM2SQL() {
		
		String pathRaiz = "";
		DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
		fd.setText("Generacion de codigo");
	    pathRaiz = fd.open();
		StringBuilder textoCodigo = new StringBuilder();
		String nombreArchivo = modelFactorySQL.getListSchemas().get(0).getName();
		
		textoCodigo.append("drop database if exists "+modelFactorySQL.getListSchemas().get(0).getName()+";\n");
		textoCodigo.append("create database "+modelFactorySQL.getListSchemas().get(0).getName()+";\n");
		textoCodigo.append("use "+modelFactorySQL.getListSchemas().get(0).getName()+";\n\n");
		textoCodigo.append("#Creacion de tablas\n");
		for(Table tabla : modelFactorySQL.getListAllTables()) {
			
			generarTabla(tabla, textoCodigo);
		}
		
		definirPrimaryKeys(textoCodigo);
		definirForeignKeys(textoCodigo);
		
		guardarArchivo(textoCodigo.toString(), pathRaiz, nombreArchivo);
		
		return "Se ha generado el codigo SQL de su proyecto";
	}
	
	public void generarTabla(Table tabla, StringBuilder textoCodigo) {
		
		textoCodigo.append("CREATE TABLE "+tabla.getName()+"(\n\n");
		
		if(tabla.getListPrimaryKeys().size()>0) {
			
			PrimaryKey pk = tabla.getListPrimaryKeys().get(0);
			
			textoCodigo.append("\t\t\t"+pk.getName() + " "+pk.getType());
			
			if(pk.getIsNotNull()) {
				textoCodigo.append(" not null");
			}
			
			if(pk.getIsAutoIncremetable()) {
				textoCodigo.append(" auto_increment");
			}
			
			textoCodigo.append(",\n");
		}
		
		for(int i=0;i<tabla.getListColumns().size();i++) {
			
			textoCodigo.append("\t\t\t"+tabla.getListColumns().get(i).getName()+" "+tabla.getListColumns().get(i).getType());
			
			if(tabla.getListColumns().get(i).getIsNotNull()) {
				textoCodigo.append(" not null");
			}
			
			if(tabla.getListColumns().get(i).getIsAutoIncremetable()) {
				textoCodigo.append(" auto_increment");
			}
			
			if(i!=tabla.getListColumns().size()-1) {
				textoCodigo.append(",\n");
			}
			
			if(i==tabla.getListColumns().size()-1 && tabla.getListForeignKeys().size()>0) {
				
				textoCodigo.append(",\n");
			}
		}
		
		if(tabla.getListForeignKeys().size()>0) {
			
			for(int i=0;i<tabla.getListForeignKeys().size();i++) {
				
				ForeignKey fk = tabla.getListForeignKeys().get(i);
				
				textoCodigo.append("\t\t\t"+fk.getName() + " "+fk.getType());
				
				if(fk.getIsNotNull()) {
					textoCodigo.append(" not null");
				}
				
				if(fk.getIsAutoIncremetable()) {
					textoCodigo.append(" auto_increment");
				}
				
				if(i!=tabla.getListForeignKeys().size()-1) {
					textoCodigo.append(",\n");
				}
				
				if(i==tabla.getListForeignKeys().size()-1) {
					textoCodigo.append("\n);\n\n");
				}
			}
		}else {
			
			textoCodigo.append("\n);\n\n");
		}
		
	}
	
	public void definirPrimaryKeys(StringBuilder textoCodigo) {
		
		textoCodigo.append("#Definicion de llaves primarias\n");
		
		for(Table tabla : modelFactorySQL.getListAllTables()) {
			
			if(tabla.getListPrimaryKeys().size()>0) {
				
				textoCodigo.append("ALTER TABLE "+tabla.getName()+" ADD PRIMARY KEY("+tabla.getListPrimaryKeys().get(0).getName()+");\n");
			}
		}
		
		textoCodigo.append("\n");
	}
	
	public void definirForeignKeys(StringBuilder textoCodigo) {
		
		textoCodigo.append("#Constraints y llaves foraneas\n");
		
		for(Table tabla : modelFactorySQL.getListAllTables()) {
			
			if(tabla.getListForeignKeys().size()>0) {
				
				for(ForeignKey fk : tabla.getListForeignKeys()) {
					
					textoCodigo.append("ALTER TABLE "+tabla.getName()+"\n");
					textoCodigo.append("ADD CONSTRAINT FK_"+tabla.getName()+"_"+fk.getName()+"\n");
					textoCodigo.append("FOREIGN KEY ("+fk.getName()+") REFERENCES "+fk.getPrimaryKey().getTableName()+"("+fk.getPrimaryKey().getName()+");\n\n");
				}
			}
		}
	}
	
	private void guardarArchivo(String cadena, String ruta, String nombre) {
		try
		{
			//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
			File archivo=new File(ruta);
			System.out.println("");
			if(archivo.exists() == false) {
				archivo.mkdirs();
			}
			//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
			FileWriter escribir=new FileWriter(archivo+"/"+nombre+".sql",true);
			//Escribimos en el archivo con el metodo write 
			escribir.write(cadena);

			//Cerramos la conexion
			escribir.close();
		}

		//Si existe un problema al escribir cae aqui
		catch(Exception e)
		{
			System.out.println("Error al Guardar");
		}

	}

}
