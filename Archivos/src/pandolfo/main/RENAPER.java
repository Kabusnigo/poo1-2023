package pandolfo.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class RENAPER {

	private List<Persona> personas;

	public RENAPER() {
		this.personas = new LinkedList<Persona>();
	}

	public void agregarPersona(Persona persona) {
		if (persona == null) throw new IllegalArgumentException();
		if (persona.getEdad() < 0) throw new EdadException();
			
		this.personas.add(persona);
	}

	public void guardarArchivo(String nombre) {
		File file = new File("./io/" + nombre);
		BufferedWriter bw = null;

		try {
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for (Persona persona : personas) {
				bw.write(persona.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
}
