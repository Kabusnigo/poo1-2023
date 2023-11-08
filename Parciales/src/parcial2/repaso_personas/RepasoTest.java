package parcial2.repaso_personas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepasoTest {

	@Test
	void readFileErrorTest() {
		assertThrows(ReadingException.class, () -> new Repaso("repaso_datos_personas_ERROR.txt"));
	}

}
