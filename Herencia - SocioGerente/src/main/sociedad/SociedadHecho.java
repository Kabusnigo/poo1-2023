package main.sociedad;

import java.util.ArrayList;

public class SociedadHecho extends Sociedad {
	
	private ArrayList<SocioHecho> socios;

	public SociedadHecho(String denominacionSocial, String domicilioLegal, double capitalSocial,
			long cuit, ArrayList<SocioHecho> socios) {
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.socios = socios;
	}

	
	@Override
	public String toString() {
		
		return "SociedadHecho ["+ super.toString() +", socios=" + socios + "]";
	}

}
