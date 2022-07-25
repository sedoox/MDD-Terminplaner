/**
 */
package Terminplaner.impl;

import Terminplaner.Nutzer;
import Terminplaner.Projekt;
import Terminplaner.Termin;
import Terminplaner.TerminplanerPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Nutzer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Terminplaner.impl.NutzerImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link Terminplaner.impl.NutzerImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link Terminplaner.impl.NutzerImpl#getTermine <em>Termine</em>}</li>
 *   <li>{@link Terminplaner.impl.NutzerImpl#getProjekte <em>Projekte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutzerImpl extends MinimalEObjectImpl.Container implements Nutzer {
	/**
	 * The default value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected static final String VORNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected String vorname = VORNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected String nachname = NACHNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTermine() <em>Termine</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermine()
	 * @generated
	 * @ordered
	 */
	protected EList<Termin> termine;

	/**
	 * The cached value of the '{@link #getProjekte() <em>Projekte</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjekte()
	 * @generated
	 * @ordered
	 */
	protected EList<Projekt> projekte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutzerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminplanerPackage.Literals.NUTZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVorname(String newVorname) {
		String oldVorname = vorname;
		vorname = newVorname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminplanerPackage.NUTZER__VORNAME, oldVorname, vorname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNachname(String newNachname) {
		String oldNachname = nachname;
		nachname = newNachname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminplanerPackage.NUTZER__NACHNAME, oldNachname, nachname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Termin> getTermine() {
		if (termine == null) {
			termine = new EObjectWithInverseResolvingEList.ManyInverse<Termin>(Termin.class, this, TerminplanerPackage.NUTZER__TERMINE, TerminplanerPackage.TERMIN__NUTZER);
		}
		return termine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Projekt> getProjekte() {
		if (projekte == null) {
			projekte = new EObjectWithInverseResolvingEList.ManyInverse<Projekt>(Projekt.class, this, TerminplanerPackage.NUTZER__PROJEKTE, TerminplanerPackage.PROJEKT__NUTZER);
		}
		return projekte;
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
			case TerminplanerPackage.NUTZER__TERMINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTermine()).basicAdd(otherEnd, msgs);
			case TerminplanerPackage.NUTZER__PROJEKTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjekte()).basicAdd(otherEnd, msgs);
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
			case TerminplanerPackage.NUTZER__TERMINE:
				return ((InternalEList<?>)getTermine()).basicRemove(otherEnd, msgs);
			case TerminplanerPackage.NUTZER__PROJEKTE:
				return ((InternalEList<?>)getProjekte()).basicRemove(otherEnd, msgs);
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
			case TerminplanerPackage.NUTZER__VORNAME:
				return getVorname();
			case TerminplanerPackage.NUTZER__NACHNAME:
				return getNachname();
			case TerminplanerPackage.NUTZER__TERMINE:
				return getTermine();
			case TerminplanerPackage.NUTZER__PROJEKTE:
				return getProjekte();
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
			case TerminplanerPackage.NUTZER__VORNAME:
				setVorname((String)newValue);
				return;
			case TerminplanerPackage.NUTZER__NACHNAME:
				setNachname((String)newValue);
				return;
			case TerminplanerPackage.NUTZER__TERMINE:
				getTermine().clear();
				getTermine().addAll((Collection<? extends Termin>)newValue);
				return;
			case TerminplanerPackage.NUTZER__PROJEKTE:
				getProjekte().clear();
				getProjekte().addAll((Collection<? extends Projekt>)newValue);
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
			case TerminplanerPackage.NUTZER__VORNAME:
				setVorname(VORNAME_EDEFAULT);
				return;
			case TerminplanerPackage.NUTZER__NACHNAME:
				setNachname(NACHNAME_EDEFAULT);
				return;
			case TerminplanerPackage.NUTZER__TERMINE:
				getTermine().clear();
				return;
			case TerminplanerPackage.NUTZER__PROJEKTE:
				getProjekte().clear();
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
			case TerminplanerPackage.NUTZER__VORNAME:
				return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
			case TerminplanerPackage.NUTZER__NACHNAME:
				return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
			case TerminplanerPackage.NUTZER__TERMINE:
				return termine != null && !termine.isEmpty();
			case TerminplanerPackage.NUTZER__PROJEKTE:
				return projekte != null && !projekte.isEmpty();
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
		result.append(" (vorname: ");
		result.append(vorname);
		result.append(", nachname: ");
		result.append(nachname);
		result.append(')');
		return result.toString();
	}

} //NutzerImpl
