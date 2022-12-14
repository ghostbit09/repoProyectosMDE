/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MBSAtributo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBS Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getModificadorAcesso <em>Modificador Acesso</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#isConstante <em>Constante</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getIsForeignKey <em>Is Foreign Key</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link abstracta.impl.MBSAtributoImpl#getIsAutoincrementable <em>Is Autoincrementable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBSAtributoImpl extends EObjectImpl implements MBSAtributo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificadorAcesso() <em>Modificador Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcesso()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICADOR_ACESSO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificadorAcesso() <em>Modificador Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcesso()
	 * @generated
	 * @ordered
	 */
	protected String modificadorAcesso = MODIFICADOR_ACESSO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_DEFECTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected String valorDefecto = VALOR_DEFECTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstante() <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstante()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstante() <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstante()
	 * @generated
	 * @ordered
	 */
	protected boolean constante = CONSTANTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected String ruta = RUTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PRIMARY_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPrimaryKey = IS_PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsForeignKey() <em>Is Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FOREIGN_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsForeignKey() <em>Is Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected Boolean isForeignKey = IS_FOREIGN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NOT_NULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNotNull = IS_NOT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAutoincrementable() <em>Is Autoincrementable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAutoincrementable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_AUTOINCREMENTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAutoincrementable() <em>Is Autoincrementable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAutoincrementable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAutoincrementable = IS_AUTOINCREMENTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSAtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.MBS_ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModificadorAcesso() {
		return modificadorAcesso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificadorAcesso(String newModificadorAcesso) {
		String oldModificadorAcesso = modificadorAcesso;
		modificadorAcesso = newModificadorAcesso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO, oldModificadorAcesso, modificadorAcesso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorDefecto() {
		return valorDefecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorDefecto(String newValorDefecto) {
		String oldValorDefecto = valorDefecto;
		valorDefecto = newValorDefecto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__VALOR_DEFECTO, oldValorDefecto, valorDefecto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstante() {
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstante(boolean newConstante) {
		boolean oldConstante = constante;
		constante = newConstante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__CONSTANTE, oldConstante, constante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta(String newRuta) {
		String oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimaryKey(Boolean newIsPrimaryKey) {
		Boolean oldIsPrimaryKey = isPrimaryKey;
		isPrimaryKey = newIsPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__IS_PRIMARY_KEY, oldIsPrimaryKey, isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsForeignKey() {
		return isForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForeignKey(Boolean newIsForeignKey) {
		Boolean oldIsForeignKey = isForeignKey;
		isForeignKey = newIsForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__IS_FOREIGN_KEY, oldIsForeignKey, isForeignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNotNull() {
		return isNotNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotNull(Boolean newIsNotNull) {
		Boolean oldIsNotNull = isNotNull;
		isNotNull = newIsNotNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__IS_NOT_NULL, oldIsNotNull, isNotNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAutoincrementable() {
		return isAutoincrementable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutoincrementable(Boolean newIsAutoincrementable) {
		Boolean oldIsAutoincrementable = isAutoincrementable;
		isAutoincrementable = newIsAutoincrementable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_ATRIBUTO__IS_AUTOINCREMENTABLE, oldIsAutoincrementable, isAutoincrementable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.MBS_ATRIBUTO__NOMBRE:
				return getNombre();
			case AbstractaPackage.MBS_ATRIBUTO__TIPO:
				return getTipo();
			case AbstractaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				return getModificadorAcesso();
			case AbstractaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				return getValorDefecto();
			case AbstractaPackage.MBS_ATRIBUTO__CONSTANTE:
				return isConstante();
			case AbstractaPackage.MBS_ATRIBUTO__RUTA:
				return getRuta();
			case AbstractaPackage.MBS_ATRIBUTO__IS_PRIMARY_KEY:
				return getIsPrimaryKey();
			case AbstractaPackage.MBS_ATRIBUTO__IS_FOREIGN_KEY:
				return getIsForeignKey();
			case AbstractaPackage.MBS_ATRIBUTO__IS_NOT_NULL:
				return getIsNotNull();
			case AbstractaPackage.MBS_ATRIBUTO__IS_AUTOINCREMENTABLE:
				return getIsAutoincrementable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractaPackage.MBS_ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__TIPO:
				setTipo((String)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				setModificadorAcesso((String)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto((String)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__CONSTANTE:
				setConstante((Boolean)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__RUTA:
				setRuta((String)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_PRIMARY_KEY:
				setIsPrimaryKey((Boolean)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_FOREIGN_KEY:
				setIsForeignKey((Boolean)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_NOT_NULL:
				setIsNotNull((Boolean)newValue);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_AUTOINCREMENTABLE:
				setIsAutoincrementable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractaPackage.MBS_ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				setModificadorAcesso(MODIFICADOR_ACESSO_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto(VALOR_DEFECTO_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__CONSTANTE:
				setConstante(CONSTANTE_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_PRIMARY_KEY:
				setIsPrimaryKey(IS_PRIMARY_KEY_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_FOREIGN_KEY:
				setIsForeignKey(IS_FOREIGN_KEY_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_NOT_NULL:
				setIsNotNull(IS_NOT_NULL_EDEFAULT);
				return;
			case AbstractaPackage.MBS_ATRIBUTO__IS_AUTOINCREMENTABLE:
				setIsAutoincrementable(IS_AUTOINCREMENTABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractaPackage.MBS_ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MBS_ATRIBUTO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case AbstractaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				return MODIFICADOR_ACESSO_EDEFAULT == null ? modificadorAcesso != null : !MODIFICADOR_ACESSO_EDEFAULT.equals(modificadorAcesso);
			case AbstractaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				return VALOR_DEFECTO_EDEFAULT == null ? valorDefecto != null : !VALOR_DEFECTO_EDEFAULT.equals(valorDefecto);
			case AbstractaPackage.MBS_ATRIBUTO__CONSTANTE:
				return constante != CONSTANTE_EDEFAULT;
			case AbstractaPackage.MBS_ATRIBUTO__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case AbstractaPackage.MBS_ATRIBUTO__IS_PRIMARY_KEY:
				return IS_PRIMARY_KEY_EDEFAULT == null ? isPrimaryKey != null : !IS_PRIMARY_KEY_EDEFAULT.equals(isPrimaryKey);
			case AbstractaPackage.MBS_ATRIBUTO__IS_FOREIGN_KEY:
				return IS_FOREIGN_KEY_EDEFAULT == null ? isForeignKey != null : !IS_FOREIGN_KEY_EDEFAULT.equals(isForeignKey);
			case AbstractaPackage.MBS_ATRIBUTO__IS_NOT_NULL:
				return IS_NOT_NULL_EDEFAULT == null ? isNotNull != null : !IS_NOT_NULL_EDEFAULT.equals(isNotNull);
			case AbstractaPackage.MBS_ATRIBUTO__IS_AUTOINCREMENTABLE:
				return IS_AUTOINCREMENTABLE_EDEFAULT == null ? isAutoincrementable != null : !IS_AUTOINCREMENTABLE_EDEFAULT.equals(isAutoincrementable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", modificadorAcesso: ");
		result.append(modificadorAcesso);
		result.append(", ValorDefecto: ");
		result.append(valorDefecto);
		result.append(", constante: ");
		result.append(constante);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(", isForeignKey: ");
		result.append(isForeignKey);
		result.append(", isNotNull: ");
		result.append(isNotNull);
		result.append(", isAutoincrementable: ");
		result.append(isAutoincrementable);
		result.append(')');
		return result.toString();
	}

} //MBSAtributoImpl
