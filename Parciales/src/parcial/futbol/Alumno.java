package parcial.futbol;

import java.util.Objects;

public class Alumno {

	private int dni;
	private String nombre;
	private String apellido;
	private int edad;

	public Alumno(int dni, String nombre, String apellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return dni == other.dni && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Objects.equals(apellido, other.apellido);
	}

}
