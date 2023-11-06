package persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RegistroDePersonas {

	public List<Persona> getPersonas(String archivo) {
		List<Persona> lp = new LinkedList<Persona>();
		String linea;
		String[] datos;

		try {
			Scanner sc = new Scanner(new File(archivo));
			while (sc.hasNext()) {
				linea = sc.nextLine();
				datos = linea.split(" ");
				int dni = Integer.parseInt(datos[0]);
				int edad = Integer.parseInt(datos[2]);
				lp.add(new Persona(dni, datos[1], edad));
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lp;
	}

	public LinkedList<Persona> getPersonaMayores(List<Persona> l, int edad) {
		LinkedList<Persona> mayores = new LinkedList<Persona>();

		for (Persona persona : l) {
			if (persona.getEdad() > edad) {
				mayores.add(persona);
			}
		}

		Collections.sort(mayores);

		return mayores;
	}

	public void generarArchivoDeLista(List<Persona> l, String salida) throws FileNotFoundException {
		PrintWriter r = new PrintWriter(new File(salida));

		for (Persona persona : l)
			r.println(persona);

		r.close();
	}

	public static void main(String[] args) {

		RegistroDePersonas rp = new RegistroDePersonas();

		List<Persona> lp = rp.getPersonas("./io/personas.in");
		LinkedList<Persona> lOrdenada = rp.getPersonaMayores(lp, 36);

		for (Persona persona : lp)
			System.out.println(persona);

		System.out.println("-----------\n");

		for (Persona persona : lOrdenada)
			System.out.println(persona);
		
		try {
			rp.generarArchivoDeLista(lOrdenada, "./archivos/mayoresDe36.out");
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

	
	
}
