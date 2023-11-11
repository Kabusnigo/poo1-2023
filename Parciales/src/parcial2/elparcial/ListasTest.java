package parcial2.elparcial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ListasTest {

	@Test
	void test() {
		Listas<Integer> comparador = new Listas<Integer>();
		ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4)) ;
		ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6)) ;
		
		assertTrue(comparador.todosSonMenores(lista1, lista2));
		assertFalse(comparador.todosSonMenores(lista2, lista1));
		
		ArrayList<String> lista3 = new ArrayList<>(Arrays.asList("Hola", "ab")) ;
		ArrayList<String> lista4 = new ArrayList<>(Arrays.asList("Zorro", "Zodiaco", "Escuadra")) ;
		
		assertTrue(comparador.todosSonMenores(lista1, lista2));
		assertFalse(comparador.todosSonMenores(lista2, lista1));
	}

}
