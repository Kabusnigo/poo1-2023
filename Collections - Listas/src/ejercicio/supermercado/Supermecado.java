/**
 * En un supermercado se mantiene una cola A con diversos clientes de los que se conoce
 * número de ubicación en la cola y cantidad de productos que lleva.
 * Se abre una nueva cola B para clientes que llevan menos de 5 productos. 
 * Usted debe dejar en la cola A los clientes que llevan más de 5 o hasta 5 productos 
 * en el orden en que estaban, y en la cola B los que compran menos de 5 artículos, 
 * respetando el orden que tenían en la cola A. En ambas colas reasignar un nuevo número 
 * de ubicación.
 */

package ejercicio.supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Supermecado {

	private List<Cliente> colaA;
	private List<Cliente> colaB;
	
	public Supermecado () {
		colaA = new ArrayList<>();
		colaB = new ArrayList<>();
	}
	
	public List<Cliente> getColaA(){
		return this.colaA;
	}
	
	public List<Cliente> getColaB(){
		return this.colaB;
	}
	
	// REALIZADO CON LIST<>, USANDO ArrayList
	public void agregarClientesAColaA(Cliente cliente) {
		cliente.setNumeroUbicacion(colaA.size() + 1);
		colaA.add(cliente);
	}
	
	private void agregarClientesAColaB() {
		for (Cliente cliente : colaA) {
			if (cliente.getCantidadDeProductos() < 5) {
				cliente.setNumeroUbicacion(colaB.size() + 1);
				colaB.add(cliente);
			}
		}
	}
	
	private void removerClientesDeColaBEnColaA() {
		colaA.removeAll(colaB);
		for (Cliente cliente : colaA)
			cliente.setNumeroUbicacion(colaA.indexOf(cliente) + 1);
	}
	
	public void reacomodarColasAyB() {
		this.agregarClientesAColaB();
		this.removerClientesDeColaBEnColaA();
	}
	
}
