package main.sociedad;

import java.util.ArrayList;

public class SociedadResposabiliadLimitada extends Sociedad {
	
	private ArrayList<SocioGerente> sociosGerentes;
	private int cantidadSociosNoGerentes;

	public SociedadResposabiliadLimitada(String denominacionSocial, String domicilioLegal, double capitalSocial,
			long cuit, ArrayList<SocioGerente> sociosGerentes, int cantidadSociosNoGerentes) {
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.sociosGerentes = sociosGerentes;
		this.cantidadSociosNoGerentes = cantidadSociosNoGerentes;
	}

	@Override
	public String toString() {
		return "SociedadResposabiliadLimitada ["+ super.toString() +"sociosGerentes=" + sociosGerentes + ", cantidadSociosNoGerentes="
				+ cantidadSociosNoGerentes + "]";
	}
	
	

	
}
