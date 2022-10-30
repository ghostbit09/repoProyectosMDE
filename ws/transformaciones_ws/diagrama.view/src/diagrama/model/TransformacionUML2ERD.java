package diagrama.model;

import abstracta.MBSAtributo;
import abstracta.MBSClase;
import abstracta.MBSRelacion;
import abstracta.ModelFactory;
import sql_metamodel.Column;
import sql_metamodel.ForeignKey;
import sql_metamodel.PrimaryKey;
import sql_metamodel.Relation;
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
		
		//Crear esquema
		Schema schema = crearSchema();
		
		if(schema != null) {
			
			//Crear tablas
			for(abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
				
				System.out.println("Clase: "+clase.getNombre());
				crearTabla(clase, schema.getName());
			}
			
			//Crear atributos
			for(abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
				
				if(clase.getAtributos().size()>0) {
					
					for(abstracta.MBSAtributo atributo : clase.getAtributos()) {
						
						//Crea el atributo
						System.out.println("Atributo: "+atributo.getNombre());
						crearAtributos(clase.getNombre(), schema.getName(), atributo);
					}
				}
			}
			
			//Comprobar si hay herencia entre dos clases
			for(abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
				
				crearHerencia(clase, schema.getName());
			}
			
			//Crear relaciones
			for(abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
				
				crearRelacion(clase, schema.getName());
			}
			
			//Crear llaves foraneas
			for(abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
				
				crearForeignKey(clase, schema.getName());
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
				
				//Se crea la llave primaria en caso de que el atributo sea una llave primaria
				PrimaryKey primaryKeyTabla = crearPrimaryKey(atributo);
				
				tabla.getListPrimaryKeys().add(primaryKeyTabla);
			}else {
				
				if(!atributo.getIsForeignKey()) {
					
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
					
					tabla.getListColumns().add(newColumn);
				}
			}
		}
	}
	
	private void crearRelacion(abstracta.MBSClase clase, String nombreSchema) {
		
		Relation newRelation = Sql_metamodelFactory.eINSTANCE.createRelation();
		
		for(MBSRelacion relacion : clase.getListaRelaciones()) {
			
			Table tableSource = obtenerTabla(relacion.getSource().getNombre(), nombreSchema);
			Table tableTarget = obtenerTabla(relacion.getTarget().getNombre(), nombreSchema);
			
			if(tableSource != null && tableTarget != null) {
				
				if(relacion.getMultiplicidadA() != null && relacion.getMultiplicidadB() != null && relacion.getMultiplicidadA().equals("*") && relacion.getMultiplicidadB().equals("*")) {
					
					//Se crea la tabla intermedia en caso de que la relacion sea de muchos a muchos
					String tableName = crearTablaIntermedia(tableSource, tableTarget, nombreSchema);
					
					if(!tableName.equals("")) {
						
						Table tablaIntermedia = obtenerTabla(tableName, nombreSchema);
						Relation relation = Sql_metamodelFactory.eINSTANCE.createRelation();
						relation.setName(tablaIntermedia.getName()+"_"+tableSource.getName());
						relation.setMultiplicidadA("*");
						relation.setMultiplicidadB("1");
						relation.setSource(tablaIntermedia);
						relation.setTarget(tableSource);
						
						tablaIntermedia.getListRelations().add(relation);
						
						Relation relation2 = Sql_metamodelFactory.eINSTANCE.createRelation();
						relation2.setName(tablaIntermedia.getName()+"_"+tableSource.getName());
						relation2.setMultiplicidadA("1");
						relation2.setMultiplicidadB("*");
						relation2.setSource(tableSource);
						relation2.setTarget(tablaIntermedia);
						
						tableSource.getListRelations().add(relation2);
						
						Relation relation3 = Sql_metamodelFactory.eINSTANCE.createRelation();
						relation3.setName(tablaIntermedia.getName()+"_"+tableTarget.getName());
						relation3.setMultiplicidadA("*");
						relation3.setMultiplicidadB("1");
						relation3.setSource(tablaIntermedia);
						relation3.setTarget(tableTarget);
						
						tablaIntermedia.getListRelations().add(relation3);
						
						Relation relation4 = Sql_metamodelFactory.eINSTANCE.createRelation();
						relation3.setName(tablaIntermedia.getName()+"_"+tableTarget.getName());
						relation4.setMultiplicidadA("1");
						relation4.setMultiplicidadB("*");
						relation4.setSource(tableTarget);
						relation4.setTarget(tablaIntermedia);
						
						tableTarget.getListRelations().add(relation4);
					}
				}else {
					
					newRelation.setName(relacion.getNombre());
					newRelation.setSource(tableSource);
					newRelation.setTarget(tableTarget);
					newRelation.setMultiplicidadA(relacion.getMultiplicidadA());
					newRelation.setMultiplicidadB(relacion.getMultiplicidadB());
					tableSource.getListRelations().add(newRelation);
				}
			}
		}
	}
	
	private void crearForeignKey(abstracta.MBSClase clase, String nombreSchema) {
		
		Table table = obtenerTabla(clase.getNombre(), nombreSchema);
		boolean flag = true;
		
		for(MBSRelacion relacion : clase.getListaRelaciones()) {
			
			for(MBSAtributo atributo : relacion.getTarget().getAtributos()) {
				
				if(atributo.getIsForeignKey()) {
					
					Table tableTarget = obtenerTabla(relacion.getTarget().getNombre(), nombreSchema);
					
					if(tableTarget.getListForeignKeys().size()>0) {
						
						for(ForeignKey fk : tableTarget.getListForeignKeys()) {
							
							if(fk.getName().equals(atributo.getNombre())){
								flag=false;
							}
						}
					}
					
					if(flag) {
						
						sql_metamodel.PrimaryKey primaryKeyTable = table.getListPrimaryKeys().get(0);
						sql_metamodel.ForeignKey newForeignKey = Sql_metamodelFactory.eINSTANCE.createForeignKey();
						newForeignKey.setName(atributo.getNombre());
						newForeignKey.setIsNotNull(atributo.getIsNotNull());
						newForeignKey.setIsAutoIncremetable(atributo.getIsAutoincrementable());
						
						if(atributo.getTipo().equals("String")) {
							
							newForeignKey.setType("varchar(10)");
						}else if(atributo.getTipo().equals("Int")) {
							
							newForeignKey.setType("integer");
						}else{
							
							newForeignKey.setType(atributo.getTipo());
						}
						
						newForeignKey.setPrimaryKey(primaryKeyTable);
						tableTarget.getListForeignKeys().add(newForeignKey);
					}
					
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
	
	private void crearHerencia(MBSClase clase, String nombreSchema) {
		
		for(MBSRelacion relacion : clase.getListaRelaciones()) {
			
			if(relacion.getTipo().equals("herencia")) {
				
				Table tableSource = obtenerTabla(relacion.getSource().getNombre(), nombreSchema);
				Table tableTarget = obtenerTabla(relacion.getTarget().getNombre(), nombreSchema);
				
				if(tableSource != null && tableTarget != null) {
					
					if(tableSource.getListPrimaryKeys().size() == 0 && tableTarget.getListPrimaryKeys().size()>0) {
						
						PrimaryKey pk = Sql_metamodelFactory.eINSTANCE.createPrimaryKey();
						pk.setName(tableTarget.getListPrimaryKeys().get(0).getName());
						pk.setIsNotNull(tableTarget.getListPrimaryKeys().get(0).getIsNotNull());
						pk.setIsAutoIncremetable(tableTarget.getListPrimaryKeys().get(0).getIsAutoIncremetable());
						pk.setType(tableTarget.getListPrimaryKeys().get(0).getType());
						tableSource.getListPrimaryKeys().add(pk);
					}
					
					for(Column column : tableTarget.getListColumns()) {
						
						Column newColumn = Sql_metamodelFactory.eINSTANCE.createColumn();
						newColumn.setName(column.getName());
						newColumn.setIsNotNull(column.getIsNotNull());
						newColumn.setIsAutoIncremetable(column.getIsAutoIncremetable());
						newColumn.setType(column.getType());
						tableSource.getListColumns().add(newColumn);
					}
					
				}
			}
				
		}
	}
	
	private String crearTablaIntermedia(Table source, Table target, String nombreSchema) {
		
		PrimaryKey keySource = source.getListPrimaryKeys().get(0);
		PrimaryKey keyTarget = target.getListPrimaryKeys().get(0);
		
		String nombre1 = source.getName()+"_"+target.getName();
		String nombre2 = target.getName()+"_"+source.getName();
		
		Table table = obtenerTabla(nombre1, nombreSchema);
		
		if(table == null) {
			
			table = obtenerTabla(nombre2, nombreSchema);
			
			if(table == null) {
				
				table = Sql_metamodelFactory.eINSTANCE.createTable();
				table.setName(nombre1);
				
				PrimaryKey pk = Sql_metamodelFactory.eINSTANCE.createPrimaryKey();
				pk.setName("id");
				pk.setIsAutoIncremetable(true);
				pk.setIsNotNull(true);
				pk.setType("integer");
				table.getListPrimaryKeys().add(pk);
				
				ForeignKey fks = Sql_metamodelFactory.eINSTANCE.createForeignKey();
				fks.setName(keySource.getName());
				fks.setIsAutoIncremetable(keySource.getIsAutoIncremetable());
				fks.setIsNotNull(keySource.getIsNotNull());
				fks.setPrimaryKey(keySource);
				
				ForeignKey fkt = Sql_metamodelFactory.eINSTANCE.createForeignKey();
				fkt.setName(keyTarget.getName());
				fkt.setIsAutoIncremetable(keyTarget.getIsAutoIncremetable());
				fkt.setIsNotNull(keyTarget.getIsNotNull());
				fkt.setPrimaryKey(keyTarget);
				
				table.getListForeignKeys().add(fks);
				table.getListForeignKeys().add(fkt);
				
				modelFactorySQL.getListSchemas().get(0).getListTables().add(table);
				modelFactorySQL.getListAllTables().add(table);
				
				return nombre1;
			}
		}
		
		return "";
		
	}
}
