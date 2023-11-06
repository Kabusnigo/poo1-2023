package parcial.academia_artistas;

public class Pintor extends Artista {

	public Pintor(int legajo, int asistencia) {
		super(legajo, asistencia);
	}

	@Override
	public String toString() {
		return "Pintor Cuota Mensual: , " + super.toString();
	}

	@Override
	public double getCuotaMensual() {
		super.setCuotaMensual(CUOTA_BASE + (CUOTA_BASE * 0.1) * super.getAsistencia());
		return super.getCuotaMensual();
	}

}
