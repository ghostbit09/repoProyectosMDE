/**
 */
package abstracta;

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
 *   <li>{@link abstracta.MBSAtributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#isConstante <em>Constante</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getIsForeignKey <em>Is Foreign Key</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link abstracta.MBSAtributo#getIsAutoincrementable <em>Is Autoincrementable</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMBSAtributo()
 * @model
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getNombre <em>Nombre</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getTipo <em>Tipo</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_ModificadorAcesso()
	 * @model
	 * @generated
	 */
	String getModificadorAcesso();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_ValorDefecto()
	 * @model
	 * @generated
	 */
	String getValorDefecto();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_Constante()
	 * @model
	 * @generated
	 */
	boolean isConstante();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#isConstante <em>Constante</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getRuta <em>Ruta</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_IsPrimaryKey()
	 * @model
	 * @generated
	 */
	Boolean getIsPrimaryKey();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #getIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Foreign Key</em>' attribute.
	 * @see #setIsForeignKey(Boolean)
	 * @see abstracta.AbstractaPackage#getMBSAtributo_IsForeignKey()
	 * @model
	 * @generated
	 */
	Boolean getIsForeignKey();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getIsForeignKey <em>Is Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Foreign Key</em>' attribute.
	 * @see #getIsForeignKey()
	 * @generated
	 */
	void setIsForeignKey(Boolean value);

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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_IsNotNull()
	 * @model
	 * @generated
	 */
	Boolean getIsNotNull();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getIsNotNull <em>Is Not Null</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSAtributo_IsAutoincrementable()
	 * @model
	 * @generated
	 */
	Boolean getIsAutoincrementable();

	/**
	 * Sets the value of the '{@link abstracta.MBSAtributo#getIsAutoincrementable <em>Is Autoincrementable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Autoincrementable</em>' attribute.
	 * @see #getIsAutoincrementable()
	 * @generated
	 */
	void setIsAutoincrementable(Boolean value);

} // MBSAtributo
