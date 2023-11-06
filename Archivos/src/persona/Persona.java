package persona;

public class Persona implements Comparable<Persona> {

	private Integer dni;
	private String apellido;
	private Integer edad;
	
	public Persona(Integer dni, String apellido, Integer edad) {
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return dni + "," + apellido + "," + edad;
	}

	@Override
	public int compareTo(Persona o) {
		return Integer.compare(this.edad, o.getEdad());
	}
	
}
