/**
 */
package diagramaAbstracta;

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
 *   <li>{@link diagramaAbstracta.MBSAtributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSAtributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSAtributo#isConstante <em>Constante</em>}</li>
 * </ul>
 *
 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSAtributo()
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSAtributo#getNombre <em>Nombre</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSAtributo_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSAtributo#getTipo <em>Tipo</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSAtributo_ModificadorAcesso()
	 * @model
	 * @generated
	 */
	String getModificadorAcesso();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSAtributo_ValorDefecto()
	 * @model
	 * @generated
	 */
	String getValorDefecto();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSAtributo_Constante()
	 * @model
	 * @generated
	 */
	boolean isConstante();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSAtributo#isConstante <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constante</em>' attribute.
	 * @see #isConstante()
	 * @generated
	 */
	void setConstante(boolean value);

} // MBSAtributo
