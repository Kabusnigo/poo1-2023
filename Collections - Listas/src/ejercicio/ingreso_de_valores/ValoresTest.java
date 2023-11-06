package ejercicio.ingreso_de_valores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValoresTest {

	private Valores valores;

	@BeforeEach
	public void valores() {
		valores = new Valores();
		valores.llenarConjuntos();
	}

	@Test
	void llenarConjuntosTest() {
		assertEquals(1, valores.getConjuntoA().size());
	}

	@Test
	void eliminarConjuntoAyBTest() {
		assertEquals(4, valores.eliminarConjuntoAyB());
	}

	@Test
	void invertirConjuntoTest() {
		for (int i = 0; i < valores.getConjuntoA().size(); i++) {
			System.out.println(valores.invertirConjunto(valores.getConjuntoA()).get(i));
		}
	}
	
}
