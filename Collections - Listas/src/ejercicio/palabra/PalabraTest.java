package ejercicio.palabra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalabraTest {
	
	private Palabra palabra;
	
	@BeforeEach
	public void Palabra() {
		palabra = new Palabra();
	}

	@Test
	void invertirPalabraTest() {
		assertEquals("aloH", palabra.invertirPalabra("Hola"));
	}
	
	@Test
	void invertirPalabraVaciaTest() {
		assertEquals("", palabra.invertirPalabra(""));
	}
	
	@Test
	void invertirPalabraDeUnaLetraTest() {
		assertEquals("a", palabra.invertirPalabra("a"));
	}
	
	@Test
	void esPalindromoTest() {
		assertTrue(palabra.esPalindromo("Neuquen"));
	}
	
}
