package parcial2.repaso_personas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Repaso {

	private List<Persona> datos;

	public Repaso(String fileName) throws ReadingException {
		datos = this.readFile(fileName);
	}

	private List<Persona> readFile(String fileName) throws ReadingException {
		List<Persona> datosLeidos = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String linea;
			datosLeidos = new ArrayList<Persona>();
			// Persona(nombre, apellido, dni, edad)
			while ((linea = br.readLine()) != null) {
				String[] datos = linea.split(",");
				Integer dni = Integer.parseInt(datos[2]);
				Integer edad = Integer.parseInt(datos[3]);
				datosLeidos.add(new Persona(datos[0], datos[1], dni, edad));
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
		
		return datosLeidos;
	}
	
	public void mostrarDatos() {
		for (Persona persona : datos)
			System.out.println(persona);
	}
	
}
