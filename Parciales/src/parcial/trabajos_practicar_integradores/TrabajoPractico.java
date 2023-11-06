package parcial.trabajos_practicar_integradores;

import java.util.ArrayList;
import java.util.List;

public class TrabajoPractico {

	private String tema;
	private float puntajeDeAprobacion;
	private List<Ejercicio> ejercicios;

	public TrabajoPractico(String tema, float puntajeDeAprobacion) {
		this.tema = tema;
		this.puntajeDeAprobacion = puntajeDeAprobacion;
		this.ejercicios = new ArrayList<Ejercicio>();
	}

	public String getTema() {
		return tema;
	}

	public List<Ejercicio> getEjercicios() {
		return ejercicios;
	}

	public boolean addEjercicio(Ejercicio ejercicio) {
		return (tema.equals("3")) ? true : false;
	}

	private float corregirTrabajoPractico(List<String> respuestas) {
		float nota = 0;
		for (String respuesta : respuestas) {
			for (Ejercicio ejericio : ejercicios)
				nota += ejericio.corregirEjercicio(respuesta);
		}
		return nota;
	}

	public boolean estaAprobado(List<String> respuestas) {
		return (corregirTrabajoPractico(respuestas) >= puntajeDeAprobacion) ? true : false;
	}

	public boolean esDeTema(String tema) {
		return this.tema.equals(tema);
	}

}
