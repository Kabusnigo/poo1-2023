package ejercicio.juego_de_memoria;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Diseñe e implemente un juego de memoria donde la idea es para un nivel
 * inicial encontrar los pares de coincidencias:
 * 
 * -La solución debe contemplar varios niveles de dificultad, para ello debe
 * disponer de una colección de tableros, modelizados a través de una jerarquía.
 * 
 * -La clase abstracta Tablero debe incluir métodos para inicializar el tablero y
 * para indicar las selecciones sucesivas del usuario.
 * 
 * -Para la entrega del ejercicio, debe implementar un tablero de 6x6 celdas que contengan 
 * números dispuestos aleatoriamente. 
 * 
 * -Cuando el usuario escoge una celda se visualiza el
 * número que contiene la misma, si la segunda selección resulta en coincidencia
 * entonces ambas celdas desaparecen, sino ambas ocultan nuevamente el número
 * que contienen.
 * 
 * -Durante el juego además del tablero se debe mostrar la
 * cantidad de selecciones que realiza el usuario.
 * 
 */
public class Juego implements Tablero {
	
	
	// Es parecido al de los Simbolos!
	private Map<Integer, Integer> tablero;
	
	public Juego() {
		tablero = new LinkedHashMap<Integer, Integer>();
	}
	
	public Map<Integer, Integer> getTablero(){
		return tablero;
	}
	
	

	@Override
	public void inicializarTablero() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eleccionesDelUsuario() {
		// TODO Auto-generated method stub
		
	}

	
	
}
