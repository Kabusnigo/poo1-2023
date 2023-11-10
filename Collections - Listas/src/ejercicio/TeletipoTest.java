package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeletipoTest {

	@Test
	void invertirPilaTest() {
		Teletipo tele = new Teletipo("abc/d//e");
		
		assertEquals("ae", tele.procesar());
	}
}
