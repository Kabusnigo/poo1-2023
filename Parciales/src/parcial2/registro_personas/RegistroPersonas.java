package parcial2.registro_personas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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
 * Nota: Mejor si recorremos la lista una sola vez. 6 . 1 Agrupar las personas
 * por edad, o sea, generar un archivo tal que figure en una línea la edad, y
 * debajo todas las personas que tienen esa edad.
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

public class RegistroPersonas {

	public LinkedList<Persona> getPersonas(String fileName) {
		LinkedList<Persona> personas = new LinkedList<Persona>();

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {
				String datos[] = linea.split(" ");
				personas.add(new Persona(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2])));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e3) {
					e3.printStackTrace();
				}
			}
		}
		
		return personas;
	}
	
	public LinkedList<Persona> getPersonasMayoresAEdad(LinkedList<Persona> personas, int edad){
		LinkedList<Persona> personasMayores = new LinkedList<Persona>();
		
		FileWriter fw = null;
		PrintWriter pr = null;
		
		Collections.sort(personas);
		
		try {
			fw = new FileWriter("personasMayoresDe" + edad + ".out");
			pr = new PrintWriter(fw);
			
			for (Persona persona : personas) {
				if (persona.getEdad() > edad) {
					personasMayores.add(persona);
					pr.println(persona);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pr.close();
		}
		
		return personasMayores;
	}
	
	public Double getEdadPromedio(LinkedList<Persona> personas) {
		Integer suma = 0;
		for (Persona persona : personas)
			suma += persona.getEdad();
		
		return (double) (suma/personas.size());
	}
	
	public LinkedList<Persona> getPersonasMayoresAEdadPromedio(LinkedList<Persona> personas){
		LinkedList<Persona> personasMayores = new LinkedList<Persona>();
		
		for (Persona persona : personas) {
			if (getEdadPromedio(personas) < persona.getEdad())
				personasMayores.add(persona);
		}
		
		return personasMayores;
	}
	
	public LinkedList<Persona> getPersonasMayoresDeEdad(LinkedList<Persona> personas){
		LinkedList<Persona> personasMayores = new LinkedList<Persona>();
		
		Integer edadMax = Collections.max(personas).getEdad();
		
		for (Persona persona : personas) {
			if (persona.getEdad() == edadMax)
				personasMayores.add(persona);
		}
		
		return personasMayores;
	}
	
	public LinkedList<Persona> getPersonasMenoresDeEdad(LinkedList<Persona> personas){
		LinkedList<Persona> personasMenores = new LinkedList<Persona>();
		
		Integer edadMax = Collections.min(personas).getEdad();
		
		for (Persona persona : personas) {
			if (persona.getEdad() == edadMax)
				personasMenores.add(persona);
		}
		
		return personasMenores;
	}
	
	public Map<Integer, List<Persona>> agruparPersonasPorEdad(LinkedList<Persona> personas) {
		Map<Integer, List<Persona>> listaPorEdad = new TreeMap<Integer, List<Persona>>() ;
		
		for (Persona persona : personas) {
			if (listaPorEdad.containsKey(persona.getEdad())) {
				listaPorEdad.get(persona.getEdad()).add(persona);
			} else {
				List<Persona> listasDePersonas = new LinkedList<Persona>();
				listasDePersonas.add(persona);
				listaPorEdad.put(persona.getEdad(), listasDePersonas);
			}
		}
		
		return listaPorEdad;
	}
	
	public LinkedList<Persona> ordernarPorDni(LinkedList<Persona> personas) {
		Comparator<Persona> comparator = new Comparator<Persona>() {
			public int compare(Persona p1, Persona p2) {
				return p1.getDni().compareTo(p2.getDni());
			}
		};
		
		Collections.sort(personas, comparator);
		
		return personas;
	}
	
	public LinkedList<Persona> ordernarPorNombre(LinkedList<Persona> personas) {
		Comparator<Persona> comparator = new Comparator<Persona>() {
			public int compare(Persona p1, Persona p2) {
				return p1.getNombre().compareTo(p2.getNombre());
			}
		};
		
		Collections.sort(personas, comparator);
		
		return personas;
	}
	
	public static void main(String[] args) {
		RegistroPersonas rp = new RegistroPersonas();
		
		LinkedList<Persona> personas = rp.getPersonas("personas.in");
		
		rp.getPersonasMayoresAEdad(personas, 34);
		
//		for (Persona persona : rp.ordernarPorNombre(rp.getPersonas("personas.in")))
//			System.out.println(persona);
//		
//		System.out.println(rp.getEdadPromedio(rp.getPersonas("personas.in")));
		
		
		for (Entry<Integer, List<Persona>> entry : rp.agruparPersonasPorEdad(personas).entrySet()) {
			Integer key = entry.getKey();
			List<Persona> val = entry.getValue();
			
			System.out.println(key);
			for (Persona persona : val) 
				System.out.println(persona);
			
		}
	}

}
