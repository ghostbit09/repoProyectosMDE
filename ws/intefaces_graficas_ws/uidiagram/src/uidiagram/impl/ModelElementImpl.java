/**
 */
package uidiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uidiagram.ModelElement;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getModelElementId <em>Model Element Id</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getLayout_marginTop <em>Layout margin Top</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getLayout_marginBottom <em>Layout margin Bottom</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getLayout_marginStart <em>Layout margin Start</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTitleFont <em>Title Font</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTitleFontSize <em>Title Font Size</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTextAppearance <em>Text Appearance</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getSrcCompat <em>Src Compat</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelElementImpl extends EObjectImpl implements ModelElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelElementId() <em>Model Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelElementId() <em>Model Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementId()
	 * @generated
	 * @ordered
	 */
	protected String modelElementId = MODEL_ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_marginTop() <em>Layout margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginTop()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_MARGIN_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayout_marginTop() <em>Layout margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginTop()
	 * @generated
	 * @ordered
	 */
	protected String layout_marginTop = LAYOUT_MARGIN_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_marginBottom() <em>Layout margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_MARGIN_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayout_marginBottom() <em>Layout margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginBottom()
	 * @generated
	 * @ordered
	 */
	protected String layout_marginBottom = LAYOUT_MARGIN_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_marginStart() <em>Layout margin Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginStart()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_MARGIN_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayout_marginStart() <em>Layout margin Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginStart()
	 * @generated
	 * @ordered
	 */
	protected String layout_marginStart = LAYOUT_MARGIN_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected String textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected String titleFont = TITLE_FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected String titleFontSize = TITLE_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextStyle() <em>Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected String textStyle = TEXT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAppearance() <em>Text Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAppearance()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_APPEARANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextAppearance() <em>Text Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAppearance()
	 * @generated
	 * @ordered
	 */
	protected String textAppearance = TEXT_APPEARANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected String inputType = INPUT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcCompat() <em>Src Compat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcCompat()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_COMPAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcCompat() <em>Src Compat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcCompat()
	 * @generated
	 * @ordered
	 */
	protected String srcCompat = SRC_COMPAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected String maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelElementId() {
		return modelElementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElementId(String newModelElementId) {
		String oldModelElementId = modelElementId;
		modelElementId = newModelElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__MODEL_ELEMENT_ID, oldModelElementId, modelElementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayout_marginTop() {
		return layout_marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_marginTop(String newLayout_marginTop) {
		String oldLayout_marginTop = layout_marginTop;
		layout_marginTop = newLayout_marginTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_TOP, oldLayout_marginTop, layout_marginTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayout_marginBottom() {
		return layout_marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_marginBottom(String newLayout_marginBottom) {
		String oldLayout_marginBottom = layout_marginBottom;
		layout_marginBottom = newLayout_marginBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_BOTTOM, oldLayout_marginBottom, layout_marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayout_marginStart() {
		return layout_marginStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_marginStart(String newLayout_marginStart) {
		String oldLayout_marginStart = layout_marginStart;
		layout_marginStart = newLayout_marginStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_START, oldLayout_marginStart, layout_marginStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(String newTextColor) {
		String oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleFont() {
		return titleFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleFont(String newTitleFont) {
		String oldTitleFont = titleFont;
		titleFont = newTitleFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TITLE_FONT, oldTitleFont, titleFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleFontSize() {
		return titleFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleFontSize(String newTitleFontSize) {
		String oldTitleFontSize = titleFontSize;
		titleFontSize = newTitleFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE, oldTitleFontSize, titleFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextStyle() {
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyle(String newTextStyle) {
		String oldTextStyle = textStyle;
		textStyle = newTextStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE, oldTextStyle, textStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAppearance() {
		return textAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAppearance(String newTextAppearance) {
		String oldTextAppearance = textAppearance;
		textAppearance = newTextAppearance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TEXT_APPEARANCE, oldTextAppearance, textAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputType() {
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputType(String newInputType) {
		String oldInputType = inputType;
		inputType = newInputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__INPUT_TYPE, oldInputType, inputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcCompat() {
		return srcCompat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcCompat(String newSrcCompat) {
		String oldSrcCompat = srcCompat;
		srcCompat = newSrcCompat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__SRC_COMPAT, oldSrcCompat, srcCompat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(String newMaxLength) {
		String oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidiagramPackage.MODEL_ELEMENT__NAME:
				return getName();
			case UidiagramPackage.MODEL_ELEMENT__MODEL_ELEMENT_ID:
				return getModelElementId();
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_TOP:
				return getLayout_marginTop();
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_BOTTOM:
				return getLayout_marginBottom();
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_START:
				return getLayout_marginStart();
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				return getWidth();
			case UidiagramPackage.MODEL_ELEMENT__HEIGHT:
				return getHeight();
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				return getBackgroundColor();
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				return getTextColor();
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				return getTitleFont();
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				return getTitleFontSize();
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				return getTextStyle();
			case UidiagramPackage.MODEL_ELEMENT__TEXT_APPEARANCE:
				return getTextAppearance();
			case UidiagramPackage.MODEL_ELEMENT__INPUT_TYPE:
				return getInputType();
			case UidiagramPackage.MODEL_ELEMENT__SRC_COMPAT:
				return getSrcCompat();
			case UidiagramPackage.MODEL_ELEMENT__MAX_LENGTH:
				return getMaxLength();
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
			case UidiagramPackage.MODEL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__MODEL_ELEMENT_ID:
				setModelElementId((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_TOP:
				setLayout_marginTop((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_BOTTOM:
				setLayout_marginBottom((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_START:
				setLayout_marginStart((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				setWidth((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__HEIGHT:
				setHeight((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				setTextColor((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				setTitleFont((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				setTitleFontSize((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				setTextStyle((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_APPEARANCE:
				setTextAppearance((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__INPUT_TYPE:
				setInputType((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__SRC_COMPAT:
				setSrcCompat((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__MAX_LENGTH:
				setMaxLength((String)newValue);
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
			case UidiagramPackage.MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__MODEL_ELEMENT_ID:
				setModelElementId(MODEL_ELEMENT_ID_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_TOP:
				setLayout_marginTop(LAYOUT_MARGIN_TOP_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_BOTTOM:
				setLayout_marginBottom(LAYOUT_MARGIN_BOTTOM_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_START:
				setLayout_marginStart(LAYOUT_MARGIN_START_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				setTitleFont(TITLE_FONT_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				setTitleFontSize(TITLE_FONT_SIZE_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				setTextStyle(TEXT_STYLE_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_APPEARANCE:
				setTextAppearance(TEXT_APPEARANCE_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__INPUT_TYPE:
				setInputType(INPUT_TYPE_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__SRC_COMPAT:
				setSrcCompat(SRC_COMPAT_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
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
			case UidiagramPackage.MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagramPackage.MODEL_ELEMENT__MODEL_ELEMENT_ID:
				return MODEL_ELEMENT_ID_EDEFAULT == null ? modelElementId != null : !MODEL_ELEMENT_ID_EDEFAULT.equals(modelElementId);
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_TOP:
				return LAYOUT_MARGIN_TOP_EDEFAULT == null ? layout_marginTop != null : !LAYOUT_MARGIN_TOP_EDEFAULT.equals(layout_marginTop);
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_BOTTOM:
				return LAYOUT_MARGIN_BOTTOM_EDEFAULT == null ? layout_marginBottom != null : !LAYOUT_MARGIN_BOTTOM_EDEFAULT.equals(layout_marginBottom);
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_START:
				return LAYOUT_MARGIN_START_EDEFAULT == null ? layout_marginStart != null : !LAYOUT_MARGIN_START_EDEFAULT.equals(layout_marginStart);
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case UidiagramPackage.MODEL_ELEMENT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				return TITLE_FONT_EDEFAULT == null ? titleFont != null : !TITLE_FONT_EDEFAULT.equals(titleFont);
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				return TITLE_FONT_SIZE_EDEFAULT == null ? titleFontSize != null : !TITLE_FONT_SIZE_EDEFAULT.equals(titleFontSize);
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				return TEXT_STYLE_EDEFAULT == null ? textStyle != null : !TEXT_STYLE_EDEFAULT.equals(textStyle);
			case UidiagramPackage.MODEL_ELEMENT__TEXT_APPEARANCE:
				return TEXT_APPEARANCE_EDEFAULT == null ? textAppearance != null : !TEXT_APPEARANCE_EDEFAULT.equals(textAppearance);
			case UidiagramPackage.MODEL_ELEMENT__INPUT_TYPE:
				return INPUT_TYPE_EDEFAULT == null ? inputType != null : !INPUT_TYPE_EDEFAULT.equals(inputType);
			case UidiagramPackage.MODEL_ELEMENT__SRC_COMPAT:
				return SRC_COMPAT_EDEFAULT == null ? srcCompat != null : !SRC_COMPAT_EDEFAULT.equals(srcCompat);
			case UidiagramPackage.MODEL_ELEMENT__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", modelElementId: ");
		result.append(modelElementId);
		result.append(", layout_marginTop: ");
		result.append(layout_marginTop);
		result.append(", layout_marginBottom: ");
		result.append(layout_marginBottom);
		result.append(", layout_marginStart: ");
		result.append(layout_marginStart);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", titleFont: ");
		result.append(titleFont);
		result.append(", titleFontSize: ");
		result.append(titleFontSize);
		result.append(", textStyle: ");
		result.append(textStyle);
		result.append(", textAppearance: ");
		result.append(textAppearance);
		result.append(", inputType: ");
		result.append(inputType);
		result.append(", srcCompat: ");
		result.append(srcCompat);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
