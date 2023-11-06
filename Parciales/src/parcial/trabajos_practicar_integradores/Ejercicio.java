package parcial.trabajos_practicar_integradores;

public class Ejercicio {

	private String consigna;
	private String respuestaCorrecta;
	private float puntajeMaximo;
	
	public Ejercicio(String consigna, String respuestaCorrecta, float puntajeMaximo) {
		this.consigna = consigna;
		this.respuestaCorrecta = respuestaCorrecta;
		this.puntajeMaximo = puntajeMaximo;
	}

	public float getPuntajeMaximo() {
		return puntajeMaximo;
	}
	
	public boolean resueltoCorrectamente(String respuesta) {
		return (respuesta.equalsIgnoreCase(respuestaCorrecta)) ? true : false;
	}
	
	public float corregirEjercicio(String respuesta) {
		return (resueltoCorrectamente(respuesta)) ? puntajeMaximo : 0;
	}
	
}
