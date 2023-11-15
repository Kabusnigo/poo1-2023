package parcial2.elparcial;

import java.util.Collections;
import java.util.List;

/**
 * 2. Escribir un método que reciba dos listas como parámetros y devuelva true
 * si todos los elementos de la primera son menores que cualquiera de la
 * segunda, y false en caso contrario Considere que los objetos que están
 * contenidos en las listas tienen órden total (Implementan Comparable y tienen
 * implementado su propio equals y hashCode). Ejemplifica su uso mediante dos
 * casos de prueba JUnit, uno con listas de Integer y otro con listas de Strings.
 * 
 *  public boolean sonTodosMenores(List<T> l1, List<T> l2) /**
 *  
 **/

public class Listas<T extends Comparable<T>> {
	public boolean todosSonMenores(List<T> l1, List<T> l2) {
		Collections.sort(l1);
		Collections.sort(l2);

		return l1.get(l1.size() - 1).compareTo(l2.get(0)) < 0;
	}
	/**
	 * ALTERNATIVA public boolean todosSonMenores(List<T> l1, List<T> l2) { for (T
	 * elem1 : l1) { for (T elem2 : l2) { if (elem1.compareTo(elem2) >= 0) { return
	 * false; } } } return true; }
	 */
}
