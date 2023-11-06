package main.sociedad;

public class SRL extends Sociedad {

	private String[] sociosGerentes;
	private double[] patrimonioDeCadaSocioGerente;
	private int cantDeSociosNoGerentes;
	private int cantDeSociosGerentes;

	public SRL(String denominacionSocial, String domicilioLegal, double capitalSocial, String cuit,
			int cantDeSociosNoGerentes) {
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.sociosGerentes = new String[3];
		this.patrimonioDeCadaSocioGerente = new double[3];
		this.cantDeSociosNoGerentes = cantDeSociosNoGerentes;
		this.cantDeSociosGerentes = 0;
	}

	public String[] getSociosGerentes() {
		return sociosGerentes;
	}

	public double[] getPatrimonioDeCadaSocioGerente() {
		return patrimonioDeCadaSocioGerente;
	}

	public int getCantDeSociosNoGerentes() {
		return cantDeSociosNoGerentes;
	}

	public void setCantDeSociosNoGerentes(int cantDeSociosNoGerentes) {
		this.cantDeSociosNoGerentes = cantDeSociosNoGerentes;
	}
	
	public void agregarSocioGerente (String name, double patrimonio) {
		if (cantDeSociosGerentes<3) {
			this.sociosGerentes[cantDeSociosGerentes] = name;
			this.patrimonioDeCadaSocioGerente[cantDeSociosGerentes] = patrimonio;
			cantDeSociosGerentes++;
		}
	}

	public String mostrarSociosGerentes() {
		String srl = "";
		for (int i = 0; i < 3; i++) {
			srl += "Socio gerente: " + sociosGerentes[i] + ", Patrimonio personal: "
					+ patrimonioDeCadaSocioGerente[i] + "\n";
		}
		
		return srl;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "----------SRL----------\n"
				+ mostrarSociosGerentes() 
				+ "Cantidad de socios no gerentes: " + cantDeSociosNoGerentes + "\n";
	}

}
