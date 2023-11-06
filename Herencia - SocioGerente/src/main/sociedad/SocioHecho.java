package main.sociedad;

public class SocioHecho extends Socio {
	
	private double porcentajeParticipacion;

	public SocioHecho(String nombre, double porcentajeParticipacion) {
		super(nombre);
		this.porcentajeParticipacion =  porcentajeParticipacion;
	}

	@Override
	public String toString() {
		return "SocioHecho ["+ super.toString() +", porcentajeParticipacion=" + porcentajeParticipacion + "]";
	}
	
	

}
