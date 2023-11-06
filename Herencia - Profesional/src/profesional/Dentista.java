package profesional;

public class Dentista extends Profesional{

	public Dentista(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public String toString() {
		return "Odontologo: " + super.toString();
	}

}
