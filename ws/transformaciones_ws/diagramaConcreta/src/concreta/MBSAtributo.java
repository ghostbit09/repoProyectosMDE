/**
 */
package concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MBSAtributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MBSAtributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link concreta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}</li>
 *   <li>{@link concreta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link concreta.MBSAtributo#isConstante <em>Constante</em>}</li>
 *   <li>{@link concreta.MBSAtributo#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.MBSAtributo#getIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link concreta.MBSAtributo#getIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link concreta.MBSAtributo#getIsAutoincrementable <em>Is Autoincrementable</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMBSAtributo()
 * @model annotation="gmf.node label='nombre' color='240,255,255' size='100,15' margin='0' border.color='255,255,255'"
 * @generated
 */
public interface MBSAtributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see concreta.ConcretaPackage#getMBSAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see concreta.ConcretaPackage#getMBSAtributo_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Modificador Acesso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modificador Acesso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modificador Acesso</em>' attribute.
	 * @see #setModificadorAcesso(String)
	 * @see concreta.ConcretaPackage#getMBSAtributo_ModificadorAcesso()
	 * @model
	 * @generated
	 */
	String getModificadorAcesso();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modificador Acesso</em>' attribute.
	 * @see #getModificadorAcesso()
	 * @generated
	 */
	void setModificadorAcesso(String value);

	/**
	 * Returns the value of the '<em><b>Valor Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Defecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Defecto</em>' attribute.
	 * @see #setValorDefecto(String)
	 * @see concreta.ConcretaPackage#getMBSAtributo_ValorDefecto()
	 * @model
	 * @generated
	 */
	String getValorDefecto();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Defecto</em>' attribute.
	 * @see #getValorDefecto()
	 * @generated
	 */
	void setValorDefecto(String value);

	/**
	 * Returns the value of the '<em><b>Constante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constante</em>' attribute.
	 * @see #setConstante(boolean)
	 * @see concreta.ConcretaPackage#getMBSAtributo_Constante()
	 * @model
	 * @generated
	 */
	boolean isConstante();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#isConstante <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constante</em>' attribute.
	 * @see #isConstante()
	 * @generated
	 */
	void setConstante(boolean value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see concreta.ConcretaPackage#getMBSAtributo_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(Boolean)
	 * @see concreta.ConcretaPackage#getMBSAtributo_IsPrimaryKey()
	 * @model
	 * @generated
	 */
	Boolean getIsPrimaryKey();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #getIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Not Null</em>' attribute.
	 * @see #setIsNotNull(Boolean)
	 * @see concreta.ConcretaPackage#getMBSAtributo_IsNotNull()
	 * @model
	 * @generated
	 */
	Boolean getIsNotNull();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getIsNotNull <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not Null</em>' attribute.
	 * @see #getIsNotNull()
	 * @generated
	 */
	void setIsNotNull(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Autoincrementable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Autoincrementable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Autoincrementable</em>' attribute.
	 * @see #setIsAutoincrementable(Boolean)
	 * @see concreta.ConcretaPackage#getMBSAtributo_IsAutoincrementable()
	 * @model
	 * @generated
	 */
	Boolean getIsAutoincrementable();

	/**
	 * Sets the value of the '{@link concreta.MBSAtributo#getIsAutoincrementable <em>Is Autoincrementable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Autoincrementable</em>' attribute.
	 * @see #getIsAutoincrementable()
	 * @generated
	 */
	void setIsAutoincrementable(Boolean value);

} // MBSAtributo
