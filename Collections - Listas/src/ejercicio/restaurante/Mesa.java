package ejercicio.restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 * Supongamos que nos piden desarrollar un sistema para administrar la entrega
 * de platos y bebidas en las diferentes mesas de un restaurante. Cada mesa se
 * identifica con un número entero (el número de mesa) y cada plato o bebida se
 * identifica con un código numérico entero (el código del plato o bebida).
 * Durante su permanencia los comensales solicitan al mozo que les sirva
 * diferentes cantidades de platos y bebidas. Luego, al finalizar el almuerzo o
 * la cena, le solicitarán la cuenta, que consiste en un detalle de lo que han
 * consumido y el importe total que deben pagar.
 */

public class Mesa {
	
	private int nroDeMesa;
	private List<COMIDA> comidas;
	
	public Mesa() {
		nroDeMesa = 0;
		comidas = new ArrayList<COMIDA>();
	}
	
	

}
