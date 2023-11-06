package main.sociedad;

public class SocioGerente extends Socio {

	private Double patrimonio;
	public SocioGerente(String nombre, double patrimonio) {
		super(nombre);
		this.patrimonio = patrimonio;
	}
	@Override
	public String toString() {
		return "SocioGerente ["+ super.toString() +", patrimonio=" + patrimonio + "]";
	}
	
	

}
