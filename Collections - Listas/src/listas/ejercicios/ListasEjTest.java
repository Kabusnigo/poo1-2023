package listas.ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListasEjTest {

	@Test
	void dosListasEnOtraOrdenadaTest() {
		ListasEj lista = new ListasEj();

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2, 4, 7));

		// l1.addAll(Arrays.asList(1,3,5,6,8,9,10));
		// l2.addAll(Arrays.asList(2,4,7));

		List<Integer> esperado = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		// esperado.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		assertEquals(esperado, lista.dosListasEnOtraOrdenada(l1, l2));
	}

	@Test
	void eliminarDuplicadosTest() {
		ListasEj lista = new ListasEj();

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1, 4, 2, 4, 3));

		List<Integer> esperado = new LinkedList<Integer>(Arrays.asList(1, 2, 4, 3));

		assertEquals(esperado, lista.eliminarDuplicados(l1));
	}

	@Test
	void invertirListaTest() {
		ListasEj lista = new ListasEj();

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 5, 4));

		List<Integer> esperado = new LinkedList<Integer>(Arrays.asList(4, 5, 3, 1, 2));

		assertEquals(esperado, lista.invertirLista(l1));
	}

	@Test
	void contieneSumaDeDosElementosTest() {
		ListasEj lista = new ListasEj();

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2, 1, 1));

		assertTrue(lista.contieneSumaDeDosElementos(l1));
	}

	@Test
	void esSublistaTest() {
		ListasEj lista = new ListasEj();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(22, 14, 6));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(39, 41, 17, 22, 14, 6, 3, 11, 73, 81));
		List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(39, 41, 22, 3, 14, 6, 11, 73, 6));
		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(22, 22, 14, 6));
		
		assertTrue(lista.esSublista(l1, l4));
	}

}
