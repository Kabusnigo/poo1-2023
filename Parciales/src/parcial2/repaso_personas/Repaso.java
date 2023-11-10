package parcial2.repaso_personas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class Repaso {

	private List<Persona> datos;

	public Repaso() {
		datos = new ArrayList<Persona>();
	}

	public void readFile(String fileName) throws ReadingException {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String linea;
			// Persona(nombre, apellido, dni, edad)
			while ((linea = br.readLine()) != null) {
				String[] datos = linea.split(",");
				Integer dni = Integer.parseInt(datos[2]);
				Integer edad = Integer.parseInt(datos[3]);
				this.datos.add(new Persona(datos[0], datos[1], dni, edad));
			}
		} catch (FileNotFoundException re) {
			throw new ReadingException("El archivo no fue encontrado.");
		} catch (IOException e) {
			throw new ReadingException("El archivo esta vacío o no se puede leer.");
		} catch (NumberFormatException e) {
			throw new ReadingException("Error al leer formato númerico.");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					throw new ReadingException("No se pudo cerrar el archivo");
				}
			}
		}
	}

	public void mostrarDatos() {
		for (Persona persona : datos)
			System.out.println(persona);
	}

	public void writeFile(String fileOut) throws ReadingException {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter(fileOut);
			pw = new PrintWriter(fw);
			Map<Integer, ArrayList<Persona>> listaEdad = this.getListaEdad();

			for (Entry<Integer, ArrayList<Persona>> entry : listaEdad.entrySet()) {
				pw.println("Edad: " + entry.getKey());
				for (Persona p : entry.getValue())
					pw.println(p);
			}
		} catch (IOException e) {
			throw new ReadingException("No se pudo escribir el archivo.");
		} finally {
			if (pw != null)
				pw.close();
		}
	}

	public Map<Integer, ArrayList<Persona>> getListaEdad() {
		Map<Integer, ArrayList<Persona>> listaEdad = new TreeMap<Integer, ArrayList<Persona>>();

		Comparator<Persona> comparator = new Comparator<Persona>() {
			public int compare(Persona p1, Persona p2) {
				return p1.getDni().compareTo(p2.getDni());
			}
		};

		for (Persona p : datos) {
			if (listaEdad.containsKey(p.getEdad())) {
				listaEdad.get(p.getEdad()).add(p);
				// Ordeno el ArrayList de personas por dni.
				Collections.sort(listaEdad.get(p.getEdad()), comparator);
			} else {
				ArrayList<Persona> personas = new ArrayList<Persona>();
				personas.add(p);
				listaEdad.put(p.getEdad(), personas);
			}
		}

		for (Entry<Integer, ArrayList<Persona>> entry : listaEdad.entrySet()) {
			System.out.println(entry.getKey());
			for (Persona p : entry.getValue())
				System.out.println(p);
		}

		return listaEdad;
	}

	public void nombresConLaLetra(Character character) {
		Stack<Persona> pila = new Stack<Persona>();
		
		for (Persona persona : datos) {
			if (persona.getNombre().charAt(0) == character)
				pila.push(persona);
		}
		
		if (!pila.isEmpty()) {
			while(!pila.isEmpty())
				System.out.println(pila.pop());
		} else
			System.out.println("No hay nombre que empieza con la letra: " + character);
		
	}
	
	public void apellidoConLaLetra(Character character) {
		Queue<Persona> cola = new ArrayDeque<Persona>();
		
		for (Persona persona : datos) {
			if (persona.getApellido().charAt(0) == character)
				cola.offer(persona);
		}
		
		if (!cola.isEmpty()) {
			while(!cola.isEmpty())
				System.out.println(cola.poll());
		} else
			System.out.println("No hay nombre que empieza con la letra: " + character);
		
	}
}
