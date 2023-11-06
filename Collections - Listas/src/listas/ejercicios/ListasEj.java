package listas.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class ListasEj {

	// 2
//	Escribir un método que reciba dos listas de números enteros ordenados y devuelva una
//	tercera lista de números enteros, con todos los elementos de las listas que recibió,
//	manteniendo el orden.
//	Por ejemplo, si recibe las listas [1,3,5,6,8,9,10] y [2,4,7], debe devolver [1,2,3,4,5,6,7,8,9,10].

	public List<Integer> dosListasEnOtraOrdenada(List<Integer> l1, List<Integer> l2) {
		List<Integer> l3 = new LinkedList<Integer>();

		l3.addAll(l1); // Es como una ForEach
		l3.addAll(l2);
		Collections.sort(l3);

		return l3;
	}

	public List<Integer> dosListasEnOtraOrdenadaYasmin(List<Integer> l1, List<Integer> l2) {
		List<Integer> aux = new LinkedList<Integer>();
		for (Integer cadaUno : l1)
			aux.add(cadaUno);
		for (Integer eleme : l2)
			aux.add(eleme);

		Collections.sort(aux);

		return aux;
	}

	/**
	 * 3 Escribe el método eliminarDuplicados, que recibe una lista de enteros y
	 * devuelve una nueva lista con los mismos elementos pero eliminando los
	 * repetidos. Por ejemplo, si la lista de entrada es: [1, 2, 2, 1, 4, 2, 4, 3],
	 * la salida sería: [1, 2, 4, 3].
	 */

	// Usamos interfaces, por esos trabajos con polimorfirmos
	public List<Integer> eliminarDuplicados(List<Integer> l) {
		List<Integer> aux = new LinkedList<Integer>();

//		for (Integer item : l) {
//			if (!aux.contains(item))
//				aux.add(item);
//		}

		Set<Integer> conjunto = new TreeSet<Integer>(l);
		// conjunto.addAll(l);

		// NO SE SIEMPRE RESPETARA EL ORDEN EN EL QUE SE INGRESO!!
		// POR ESO NO SABRE EL ORDEN FINAL
		Set<Integer> lin = new LinkedHashSet<Integer>(l);

		aux.addAll(lin);

		return aux;
	}

	/**
	 * 4 Escriba un método que reciba una lista de enteros y la devuelva invertida.
	 * Por ejemplo, si recibe la lista [2, 1, 3, 5, 4] devolverá la lista [4, 5, 3,
	 * 1, 2].
	 */

	public List<Integer> invertirLista(List<Integer> lista) {
		List<Integer> aux = new LinkedList<Integer>();

//		for (int i = lista.size() - 1; i >= 0; i--)
//			aux.add(lista.get(i));

		// CON ITERATOR
		ListIterator<Integer> litr = lista.listIterator(lista.size());

		while (litr.hasPrevious()) {
			aux.add(litr.previous());
		}

		// La devuelve ordenada pero no invertida
		// Collections.sort(aux, Collections.reverseOrder());

		return aux;
	}

	// 5
	// Escriba un método que reciba una lista de enteros y devuelva true si la lista
	// contiene dos elementos tales que el número resultante de sumarlos también sea
	// un elemento de la lista.

	public boolean contieneSumaDeDosElementos(List<Integer> lista) {

//		for (int i = 0; i < lista.size(); i++) {
//			for (int j = 0; j < lista.size(); j++) {
//				if (lista.contains(lista.get(i) + lista.get(j)) && i != j)
//					return true;
//			}
//		}

		boolean found = false;

		for (Integer integer : lista) {
			for (Integer integer2 : lista) {
				if (lista.contains(integer + integer2) && lista.indexOf(integer) != lista.lastIndexOf(integer2))
					found = true;
			}
		}

		return found;
	}

	/* Ejercicio 05
	 * Escriba un método que devuelva true si una lista de enteros es sublista de
	 * otra. Por ejemplo: si tenemos las listas L1 = [22, 14, 6] y L2 = [39, 41, 17,
	 * 22, 14, 6, 3, 11, 73, 81] entonces el método devolverá true porque L1 es una
	 * sublista de L2. Pero si tenemos otra lista L3 = [39, 41, 22, 17, 14, 3, 11,
	 * 73, 6, 81], vemos que L1 no es sublista de L3 por lo que el método llamado
	 * con L1 y L3 debe devolver false.
	 */

	public boolean esSublista(List<Integer> subLista, List<Integer> lista) {
		int indexLista = lista.indexOf(subLista.get(0));

		if (indexLista == -1) // DEVUELVE -1 SINO ENCUENTRA EL OBJETO
			return false; // COMO NO LO ENCONTRO, RETORNO FALSE

		if (lista.get(indexLista + 1) == subLista.get(0))
			esSublista(subLista, lista.subList(indexLista + 1, lista.size()));
		
		for (int i = 1; i < subLista.size(); i++) {
			if (lista.get(indexLista + i) != subLista.get(i)) {
				return false;
			}
		}

		return true;
	}

	

	// MAIN
	public static void main(String[] args) {

		ListasEj listas = new ListasEj();

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();

		l1.addAll(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		l2.addAll(Arrays.asList(2, 4, 7));

		List<Integer> l3 = listas.dosListasEnOtraOrdenada(l1, l2);

		System.out.println(l3);

	}

}
