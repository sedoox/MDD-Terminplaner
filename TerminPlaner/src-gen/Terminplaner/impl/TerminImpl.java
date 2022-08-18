/**
 */
package Terminplaner.impl;

import Terminplaner.Nutzer;
import Terminplaner.Termin;
import Terminplaner.TerminplanerPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Terminplaner.impl.TerminImpl#getName <em>Name</em>}</li>
 *   <li>{@link Terminplaner.impl.TerminImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link Terminplaner.impl.TerminImpl#getStartDatum <em>Start Datum</em>}</li>
 *   <li>{@link Terminplaner.impl.TerminImpl#getNutzer <em>Nutzer</em>}</li>
 *   <li>{@link Terminplaner.impl.TerminImpl#getEndDatum <em>End Datum</em>}</li>
 *   <li>{@link Terminplaner.impl.TerminImpl#getOrt <em>Ort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminImpl extends MinimalEObjectImpl.Container implements Termin {
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
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDatum() <em>Start Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDatum()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDatum() <em>Start Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDatum()
	 * @generated
	 * @ordered
	 */
	protected Date startDatum = START_DATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNutzer() <em>Nutzer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutzer()
	 * @generated
	 * @ordered
	 */
	protected EList<Nutzer> nutzer;

	/**
	 * The default value of the '{@link #getEndDatum() <em>End Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDatum()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDatum() <em>End Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDatum()
	 * @generated
	 * @ordered
	 */
	protected Date endDatum = END_DATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected static final String ORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected String ort = ORT_EDEFAULT;
	
	protected int order = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminplanerPackage.Literals.TERMIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TerminplanerPackage.TERMIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminplanerPackage.TERMIN__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDatum() {
		return startDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDatum(Date newStartDatum) {
		Date oldStartDatum = startDatum;
		startDatum = newStartDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminplanerPackage.TERMIN__START_DATUM, oldStartDatum, startDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nutzer> getNutzer() {
		if (nutzer == null) {
			nutzer = new EObjectWithInverseResolvingEList.ManyInverse<Nutzer>(Nutzer.class, this, TerminplanerPackage.TERMIN__NUTZER, TerminplanerPackage.NUTZER__TERMINE);
		}
		return nutzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDatum() {
		return endDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDatum(Date newEndDatum) {
		Date oldEndDatum = endDatum;
		endDatum = newEndDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminplanerPackage.TERMIN__END_DATUM, oldEndDatum, endDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrt() {
		return ort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrt(String newOrt) {
		String oldOrt = ort;
		ort = newOrt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminplanerPackage.TERMIN__ORT, oldOrt, ort));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * NOT @generated NOT
	 */
	public void setOrder(int order) {
		this.order= order ;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * NOT @generated NOT
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerminplanerPackage.TERMIN__NUTZER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNutzer()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerminplanerPackage.TERMIN__NUTZER:
				return ((InternalEList<?>)getNutzer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminplanerPackage.TERMIN__NAME:
				return getName();
			case TerminplanerPackage.TERMIN__BESCHREIBUNG:
				return getBeschreibung();
			case TerminplanerPackage.TERMIN__START_DATUM:
				return getStartDatum();
			case TerminplanerPackage.TERMIN__NUTZER:
				return getNutzer();
			case TerminplanerPackage.TERMIN__END_DATUM:
				return getEndDatum();
			case TerminplanerPackage.TERMIN__ORT:
				return getOrt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TerminplanerPackage.TERMIN__NAME:
				setName((String)newValue);
				return;
			case TerminplanerPackage.TERMIN__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case TerminplanerPackage.TERMIN__START_DATUM:
				setStartDatum((Date)newValue);
				return;
			case TerminplanerPackage.TERMIN__NUTZER:
				getNutzer().clear();
				getNutzer().addAll((Collection<? extends Nutzer>)newValue);
				return;
			case TerminplanerPackage.TERMIN__END_DATUM:
				setEndDatum((Date)newValue);
				return;
			case TerminplanerPackage.TERMIN__ORT:
				setOrt((String)newValue);
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
			case TerminplanerPackage.TERMIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TerminplanerPackage.TERMIN__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case TerminplanerPackage.TERMIN__START_DATUM:
				setStartDatum(START_DATUM_EDEFAULT);
				return;
			case TerminplanerPackage.TERMIN__NUTZER:
				getNutzer().clear();
				return;
			case TerminplanerPackage.TERMIN__END_DATUM:
				setEndDatum(END_DATUM_EDEFAULT);
				return;
			case TerminplanerPackage.TERMIN__ORT:
				setOrt(ORT_EDEFAULT);
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
			case TerminplanerPackage.TERMIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TerminplanerPackage.TERMIN__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case TerminplanerPackage.TERMIN__START_DATUM:
				return START_DATUM_EDEFAULT == null ? startDatum != null : !START_DATUM_EDEFAULT.equals(startDatum);
			case TerminplanerPackage.TERMIN__NUTZER:
				return nutzer != null && !nutzer.isEmpty();
			case TerminplanerPackage.TERMIN__END_DATUM:
				return END_DATUM_EDEFAULT == null ? endDatum != null : !END_DATUM_EDEFAULT.equals(endDatum);
			case TerminplanerPackage.TERMIN__ORT:
				return ORT_EDEFAULT == null ? ort != null : !ORT_EDEFAULT.equals(ort);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(", startDatum: ");
		result.append(startDatum);
		result.append(", endDatum: ");
		result.append(endDatum);
		result.append(", ort: ");
		result.append(ort);
		result.append(')');
		return result.toString();
	}

} //TerminImpl
