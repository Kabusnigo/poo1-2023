package parcial2.ventas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Escribir un método que reciba dos listas como parámetros y devuelva una
 * tercera lista que sea la diferencia simétrica entre la primera y la segunda.
 * La diferencia simétrica entre dos listas son los objetos que están en la
 * primera lista o en la segunda pero no ambos a la vez. Considere que los
 * objetos que están contenidos en las listas tienen órden total (Implementan
 * Comparable y tienen implementado su propio equals y hashCode).
 */

public class DiferenciaSimetrica {

	public List<Integer> calcularDiferenciaSimetrica(List<Integer> lista1, List<Integer> lista2){
		List<Integer> lista3 = new ArrayList<Integer>();
		List<Integer> tienenEnComun = new ArrayList<Integer>();
		
		lista3.addAll(lista1);
		lista3.addAll(lista2);
		
		for (Integer integer : lista1) {
			for (Integer integer2 : lista2) {
				if (integer == integer2 && !tienenEnComun.contains(integer))
					tienenEnComun.add(integer2);
			}
		}
		lista3.removeAll(tienenEnComun);
		
		return lista3;
	}
	
	public List<Integer> obtenerDiferenciaSimetrica(List<Integer> lista1, List<Integer> lista2){
		List<Integer> diferenciaSimetrica = new ArrayList<Integer>();
		List<Integer> tienenEnComun = new ArrayList<Integer>();
		
		diferenciaSimetrica.addAll(lista1);
		diferenciaSimetrica.addAll(lista2);
		
		tienenEnComun.addAll(lista1);
		tienenEnComun.retainAll(lista2);
		
		diferenciaSimetrica.removeAll(tienenEnComun);
		
		return diferenciaSimetrica;
	}
	
	
	public List<Integer> diferenciaSimetrica(List<Integer> l1, List<Integer> l2) {
		List<Integer> diferenciaSimetrica = new LinkedList<Integer>();
		// recorro l1
		for (Integer cadaElementoEnL1 : l1) {
			if (!l2.contains(cadaElementoEnL1))
				diferenciaSimetrica.add(cadaElementoEnL1);
		}
		// recorro l2
		for (Integer cadaElementoEnL2 : l2) {
			if (!l1.contains(cadaElementoEnL2))
				diferenciaSimetrica.add(cadaElementoEnL2);
		}

		return diferenciaSimetrica;

	}
	
	public static void main(String[] args) {
		
		DiferenciaSimetrica ds = new DiferenciaSimetrica();
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		lista2.add(3);
		lista2.add(4);
		lista2.add(5);
		
//		System.out.println(ds.calcularDiferenciaSimetrica(lista, lista2));
		System.out.println(ds.obtenerDiferenciaSimetrica(lista, lista2));
	}
	
}
