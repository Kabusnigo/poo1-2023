package parcial.academia_artistas;

public abstract class Artista implements Comparable<Artista> {

	private int legajo;
	private int asistencia;
	protected static final double CUOTA_BASE = 10000;
	private double cuotaMensual;
	
	public Artista(int legajo, int asistencia) {
		this.legajo = legajo;
		this.asistencia = asistencia;
		this.cuotaMensual = 0;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}
	
	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	
	public int getAsistencia() {
		return asistencia;
	}

	@Override
	public String toString() {
		return "Legajo: " + legajo + ", Asistencia: " + asistencia + "\n";
	}

	@Override
	public int compareTo(Artista o) {
		return Integer.compare(this.legajo, o.legajo);
	}
	
	
	
}
