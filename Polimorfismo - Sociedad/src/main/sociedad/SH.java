package main.sociedad;

import java.util.ArrayList;

public class SH extends Sociedad {

	
	private ArrayList<String> listaDeSocios;
	private ArrayList<Double> porcentajeDeParticipacionDeLosSocios;
	
	public SH(String denominacionSocial, String domicilioLegal, double capitalSocial, String cuit) {
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.listaDeSocios = new ArrayList<String>();
		this.porcentajeDeParticipacionDeLosSocios = new ArrayList<Double>();
	}

	public ArrayList<String> getListaDeSocios() {
		return listaDeSocios;
	}

	public ArrayList<Double> getPorcentajeDeParticipacionDeLosSocios() {
		return porcentajeDeParticipacionDeLosSocios;
	}

	public void agregarSocioGerente (String name, double porcentaje) {
		this.listaDeSocios.add(name);
		this.porcentajeDeParticipacionDeLosSocios.add(porcentaje);
	}
	
	public String mostrarSociosGerentes() {
		String sh = "";
		
		for (int i = 0; i < listaDeSocios.size(); i++) {
			sh += "Socio gerente: " + listaDeSocios.get(i) + ", Porcentaje de participación: "
					+ porcentajeDeParticipacionDeLosSocios.get(i) + "%\n" ;
		}
		
		return sh;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "----------SH----------\n"
				+ mostrarSociosGerentes();
	}
	
}
