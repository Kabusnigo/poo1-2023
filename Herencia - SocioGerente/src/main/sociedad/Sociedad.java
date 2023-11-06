package main.sociedad;

public abstract class Sociedad {
	
	private String denominacionSocial;
	private String domicilioLegal;
	private double capitalSocial;
	private long cuit;
	
	public Sociedad(String denominacionSocial, String domicilioLegal, double capitalSocial, long cuit) {
		this.denominacionSocial = denominacionSocial;
		this.domicilioLegal = domicilioLegal;
		this.capitalSocial = capitalSocial;
		this.cuit = cuit;
	}
	
	
	
	@Override
	public String toString() {
		return "denominacionSocial=" + denominacionSocial + ", domicilioLegal=" + domicilioLegal
				+ ", capitalSocial=" + capitalSocial + ", cuit=" + cuit;
	}



	public void imprimirInformacionDisponible() {
		System.out.println(toString());
	}
	

}
