package main.sociedad;

import java.util.Objects;

public abstract class Sociedad implements Comparable<Sociedad> {

	private String denominacionSocial;
	private String domicilioLegal;
	private double capitalSocial;
	private String cuit;

	public Sociedad(String denominacionSocial, String domicilioLegal, double capitalSocial, String cuit) {
		this.denominacionSocial = denominacionSocial;
		this.domicilioLegal = domicilioLegal;
		this.capitalSocial = capitalSocial;
		this.cuit = cuit;
	}

	public void setDenominacionSocial(String denominacionSocial) {
		this.denominacionSocial = denominacionSocial;
	}

	public String getDenominacionSocialString() {
		return denominacionSocial;
	}

	public String getDomicilioLegal() {
		return domicilioLegal;
	}

	public void setDomicilioLegal(String domicilioLegal) {
		this.domicilioLegal = domicilioLegal;
	}

	public double getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitalSocial, cuit, denominacionSocial, domicilioLegal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sociedad other = (Sociedad) obj;
		return Double.doubleToLongBits(capitalSocial) == Double.doubleToLongBits(other.capitalSocial)
				&& Objects.equals(cuit, other.cuit) 
				&& Objects.equals(denominacionSocial, other.denominacionSocial)
				&& Objects.equals(domicilioLegal, other.domicilioLegal);
	}
	
	@Override
	public int compareTo(Sociedad o) {
		return Double.compare(this.capitalSocial, o.capitalSocial);
	}

	@Override
	public String toString() {
		return "Denominacion Social: " + denominacionSocial + "   Domicilio Legal: " + domicilioLegal
				+ "\nCapital Social: " + capitalSocial + "   Cuit: " + cuit + "\n";
	}
}
