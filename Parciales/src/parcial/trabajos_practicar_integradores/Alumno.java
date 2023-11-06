package parcial.trabajos_practicar_integradores;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private List<TrabajoPractico> trabajosPracticos;
	private List<List<String>> respuestas;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		trabajosPracticos = new ArrayList<TrabajoPractico>();
		respuestas = new ArrayList<List<String>>();
	}
	
	public boolean realizarTrabajoPractico(TrabajoPractico trabajoPractico, List<String> respuestas) {
		if (trabajosPracticos.contains(trabajoPractico)) {
			return false;
		}
		trabajosPracticos.add(trabajoPractico);
		this.respuestas.add(respuestas);
		return true;
	}
	
	public boolean aproboTema(String tema) {
		for (TrabajoPractico tp : trabajosPracticos) {
			if (tp.esDeTema(tema)) {
				for (List<String> respuesta : respuestas)
					if (tp.estaAprobado(respuesta)) return true;
			}
		}
		return false;
	}
	
}
