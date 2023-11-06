package parcial.academia_artistas;

public class Escultor extends Artista {

	public Escultor(int legajo, int asistencia) {
		super(legajo, asistencia);
	}

	@Override
	public String toString() {
		return "Pintor Cuota Mensual: , " + super.toString();
	}

	@Override
	public double getCuotaMensual() {
		super.setCuotaMensual(CUOTA_BASE + (CUOTA_BASE * 0.05) * super.getAsistencia());
		return super.getCuotaMensual();
	}
	
}
