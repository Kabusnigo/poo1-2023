package parcial2.repaso_personas;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer edad;

	public Persona(String nombre, String apellido, Integer dni, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return this.dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public int compareTo(Persona p) {
		return Integer.compare(edad, p.getEdad());
	}

	@Override
	public String toString() {
		return nombre + "," + apellido + "," + dni;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;
		Persona other = (Persona) obj;
		return nombre.equals(other.getNombre()) && apellido.equals(other.getApellido()) &&
				dni.equals(other.getDni()) && edad == other.getEdad();
	}

}
