/**
 */
package Terminplaner.impl;

import Terminplaner.Kalender;
import Terminplaner.Nutzer;
import Terminplaner.Projekt;
import Terminplaner.Termin;
import Terminplaner.TerminplanerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kalender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Terminplaner.impl.KalenderImpl#getProjekte <em>Projekte</em>}</li>
 *   <li>{@link Terminplaner.impl.KalenderImpl#getTermine <em>Termine</em>}</li>
 *   <li>{@link Terminplaner.impl.KalenderImpl#getNutzer <em>Nutzer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KalenderImpl extends MinimalEObjectImpl.Container implements Kalender {
	/**
	 * The cached value of the '{@link #getProjekte() <em>Projekte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjekte()
	 * @generated
	 * @ordered
	 */
	protected EList<Projekt> projekte;

	/**
	 * The cached value of the '{@link #getTermine() <em>Termine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermine()
	 * @generated
	 * @ordered
	 */
	protected EList<Termin> termine;

	/**
	 * The cached value of the '{@link #getNutzer() <em>Nutzer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutzer()
	 * @generated
	 * @ordered
	 */
	protected EList<Nutzer> nutzer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KalenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminplanerPackage.Literals.KALENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Projekt> getProjekte() {
		if (projekte == null) {
			projekte = new EObjectContainmentEList<Projekt>(Projekt.class, this, TerminplanerPackage.KALENDER__PROJEKTE);
		}
		return projekte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Termin> getTermine() {
		if (termine == null) {
			termine = new EObjectContainmentEList<Termin>(Termin.class, this, TerminplanerPackage.KALENDER__TERMINE);
		}
		return termine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nutzer> getNutzer() {
		if (nutzer == null) {
			nutzer = new EObjectContainmentEList<Nutzer>(Nutzer.class, this, TerminplanerPackage.KALENDER__NUTZER);
		}
		return nutzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerminplanerPackage.KALENDER__PROJEKTE:
				return ((InternalEList<?>)getProjekte()).basicRemove(otherEnd, msgs);
			case TerminplanerPackage.KALENDER__TERMINE:
				return ((InternalEList<?>)getTermine()).basicRemove(otherEnd, msgs);
			case TerminplanerPackage.KALENDER__NUTZER:
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
			case TerminplanerPackage.KALENDER__PROJEKTE:
				return getProjekte();
			case TerminplanerPackage.KALENDER__TERMINE:
				return getTermine();
			case TerminplanerPackage.KALENDER__NUTZER:
				return getNutzer();
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
			case TerminplanerPackage.KALENDER__PROJEKTE:
				getProjekte().clear();
				getProjekte().addAll((Collection<? extends Projekt>)newValue);
				return;
			case TerminplanerPackage.KALENDER__TERMINE:
				getTermine().clear();
				getTermine().addAll((Collection<? extends Termin>)newValue);
				return;
			case TerminplanerPackage.KALENDER__NUTZER:
				getNutzer().clear();
				getNutzer().addAll((Collection<? extends Nutzer>)newValue);
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
			case TerminplanerPackage.KALENDER__PROJEKTE:
				getProjekte().clear();
				return;
			case TerminplanerPackage.KALENDER__TERMINE:
				getTermine().clear();
				return;
			case TerminplanerPackage.KALENDER__NUTZER:
				getNutzer().clear();
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
			case TerminplanerPackage.KALENDER__PROJEKTE:
				return projekte != null && !projekte.isEmpty();
			case TerminplanerPackage.KALENDER__TERMINE:
				return termine != null && !termine.isEmpty();
			case TerminplanerPackage.KALENDER__NUTZER:
				return nutzer != null && !nutzer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KalenderImpl
