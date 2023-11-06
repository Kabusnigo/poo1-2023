package ejercicio.simbolos_balanceados;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimbolosTest {

	@Test
	void estaBalanceadoTest() {
		Simbolos simbolos = new Simbolos();
		assertTrue(simbolos.estaBalanceado("{()}[]"));
	}

	@Test
	void ejemploBalanceadoTest() {
		Simbolos simbolos = new Simbolos();
		
		assertTrue(simbolos.estaBalanceado("[()]{}{[()()]()}"));
	
	}
	
	@Test
	void ejemploNoBalanceadoTest() {
		Simbolos simbolos = new Simbolos();
		assertFalse(simbolos.estaBalanceado("[(])"));
	}
	
	@Test
	void empiezaConCierreTest() {
		Simbolos simbolos = new Simbolos();
		assertFalse(simbolos.estaBalanceado("][]()["));
	}
	@Test
	void unoDeAperturaDeMasTest() {
		Simbolos simbolos = new Simbolos();
		assertFalse(simbolos.estaBalanceado("[()]{}{[()()]()"));
	}
	
}
