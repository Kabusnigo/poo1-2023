package parcial2.registro_personas;

/**
 * 1. Implementar un método getPersonas de la class RegistroPersonas que reciba
 * el nombre de un archivo y devuelva un objeto LinkedList<Persona> con personas
 * que fueron leídas del archivo de texto con formato "dni apellido edad"
 * (Integer String Integer);
 * 
 * 2. Implementar un método getPersonasMayoresAEdad que reciba un objeto
 * LinkedList<Persona> y una edad y devuelva otro objeto LinkedList<Persona> con
 * las personas cuyas edades son mayores a esa edad. Guardar esas personas en un
 * archivo “personasMayoresDeXX.out”, donde xx sea la edad que se usó como
 * parámetro. Guardarlo ordenado alfabéticamente.
 * 
 * 3.Implementar un método que devuelva la edad promedio de la muestra de
 * personas.
 * 
 * 4. Implementar un método que devuelva la cantidad de personas cuya edad está
 * por encima de la edad promedio.
 * 
 * 5. ¿Cual es la persona de mayor edad?, si hubiera varias, mostrarlas a todas.
 * 
 * 6. ¿Cual es la persona de menor edad?, si hubiera varias, mostrarlas a todas.
 * Nota: Mejor si recorremos la lista una sola vez. 
 * 6 . 1 Agrupar las personas por edad, o sea, generar un archivo tal que figure
 * en una línea la edad, y debajo todas las personas que tienen esa edad.
 * 
 * 7. Sobreescribir los métodos: equals de Object para determinar que dos
 * objetos personas son iguales si sus dni´s son iguales. toString de Object
 * para aplanar el objeto a una cadena que contiene los colaboradores internos
 * del objeto separado por “;”.
 * 
 * 8. Se debe poder listar a las personas ordenadas por dni, por apellido y por
 * edad (de mayor a menor).
 * 
 */

public class Persona implements Comparable<Persona> {
	
	private Integer dni;
	private String nombre;
	private Integer edad;
	
	public Persona(Integer dni, String nombre, Integer edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Integer getDni() {
		return dni;
	}
	
	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public int compareTo(Persona o) {
		return Integer.compare(this.edad, o.edad);
	}
	
	@Override
	public boolean equals(Object o) {
		Persona other = (Persona) o;
		return this.dni.equals(other.getDni());
	}
	
	@Override
	public String toString() {
		return dni + ";" + nombre + ";" + edad;
	}
	
	
}
