package parcial2.repaso_personas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepasoTest {

	@Test
	void readFileErrorTest() {
		Repaso repaso = new Repaso();
		assertThrows(ReadingException.class, () -> repaso.readFile("repaso_datos_personas_ERROR.txt"));
	}
	
	@Test
	void readFileTest() throws ReadingException {
		Repaso repaso = new Repaso();
		repaso.readFile("repaso_datos_personas.txt");
		repaso.mostrarDatos();
		
	}

}
