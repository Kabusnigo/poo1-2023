package profesional;

public abstract class Profesional implements Comparable<Profesional> {

	protected String nombre;
	protected String apellido;
	private static double HONORARIO_BASICO = 500000.00;

	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public double getHonorario() {
		return Profesional.HONORARIO_BASICO;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "  Apellido: " + apellido + "  Honorario: " + getHonorario();
	}

	@Override
	public int compareTo(Profesional o) {
		// PRIMER METODO
//		if (this.getHonorario() < o.getHonorario())
//			return -1;
//		else {
//			if (this.getHonorario() > o.getHonorario())
//				return 1;
//			else
//				return 0;
//		}
		
		
		// MEJOR METODO
		
		return -1*(Double.compare(o.getHonorario(), this.getHonorario()));
		//return Double.compare(o.getHonorario(), this.getHonorario());
	}

}
