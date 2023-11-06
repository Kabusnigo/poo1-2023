package parcial.geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FigurasTest {

	@Test
	void trianguloTest() {
		Triangulo t = new Triangulo(5, 2);
		assertEquals(5, t.getArea());
	}
	
	@Test
	void rectanguloTest() {
		Rectangulo r = new Rectangulo(4,5);
		assertEquals(16, r.getArea());
	}
	
	@Test
	void cuadradoTest() {
		Cuadrado c = new Cuadrado(5);
		assertEquals(25, c.getArea());
	}

}
