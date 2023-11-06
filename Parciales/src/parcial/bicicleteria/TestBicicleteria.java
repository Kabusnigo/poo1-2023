package parcial.bicicleteria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBicicleteria {

	private Bicicleteria bicicleteria;

	@BeforeEach
	public void TestBicicleteria() {
		bicicleteria = new Bicicleteria();
	}

	@Test
	void crearBicicleteriaTest() {
		bicicleteria.addBicicleta(new Bicicleta("MO-034", "Selic", 1998));
		bicicleteria.addBicicleta(new Bicicleta("JK-445", "Honda", 2010));
		bicicleteria.addBicicleta(new Bicicleta("PQ-777", "Audino", 2016));

		Bicicleta biciEsperada = new Bicicleta("PQ-777", "Audino", 2016);

		assertTrue(bicicleteria.getBicicletas().contains(biciEsperada));
	}

	@Test
	void buscarBicicletaTest() {
		bicicleteria.addBicicleta(new Bicicleta("MO-034", "Selic", 1998));
		bicicleteria.addBicicleta(new Bicicleta("JK-445", "Honda", 2010));
		bicicleteria.addBicicleta(new Bicicleta("PQ-777", "Audino", 2016));

		Bicicleta biciAVender = new Bicicleta("PQ-777", "Audino", 2016);

		assertEquals(biciAVender, bicicleteria.buscarBicicleta("PQ-777"));
	}

	@Test
	void venderBicicletaTest() {
		bicicleteria.addBicicleta(new Bicicleta("MO-034", "Selic", 1998));
		bicicleteria.addBicicleta(new Bicicleta("JK-445", "Honda", 2010));
		bicicleteria.addBicicleta(new Bicicleta("PQ-777", "Audino", 2016));
		
		Bicicleta biciAVender = new Bicicleta("PQ-777", "Audino", 2016);
		
		bicicleteria.venderBicicleta(biciAVender);
		
		assertEquals(2, bicicleteria.getBicicletas().size());
	}

}
