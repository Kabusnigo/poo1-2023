package main.sociedad;

public abstract class Socio {

	private String nombre;

	public Socio(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre;
	}
	
	
	
}
