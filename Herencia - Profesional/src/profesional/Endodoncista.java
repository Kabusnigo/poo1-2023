package profesional;

public class Endodoncista extends Dentista{

	public Endodoncista(String nombre, String apellido) {
		super(nombre, apellido);
	}

	@Override
	public double getHonorario()  {
		return super.getHonorario() * 1.25;
	}
	
	@Override
	public String toString() {
		return "->Odontologo Endodontista->" + super.toString();
	}
	
}
