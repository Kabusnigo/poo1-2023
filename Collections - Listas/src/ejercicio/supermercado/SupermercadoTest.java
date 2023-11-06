package ejercicio.supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SupermercadoTest {

	@Test
	void agregarClientesAColaATest() {
		Cliente c1 = new Cliente(4);
		Cliente c2 = new Cliente(6);
		Cliente c3 = new Cliente(7);
		
		Supermecado supermecado = new Supermecado();
		
		supermecado.agregarClientesAColaA(c1);
		supermecado.agregarClientesAColaA(c2);
		supermecado.agregarClientesAColaA(c3);
		
		assertEquals(4, supermecado.getColaA().get(0).getCantidadDeProductos());
		assertEquals(2, supermecado.getColaA().get(1).getNumeroUbicacion());
	}
	
	@Test
	void agregarClientesAColaBTest() {
		Cliente c1 = new Cliente(4);
		Cliente c2 = new Cliente(6);
		Cliente c3 = new Cliente(7);
		Cliente c4 = new Cliente(3);
		Cliente c5 = new Cliente(9);
		
		Supermecado supermecado = new Supermecado();
		
		supermecado.agregarClientesAColaA(c1);
		supermecado.agregarClientesAColaA(c2);
		supermecado.agregarClientesAColaA(c3);
		supermecado.agregarClientesAColaA(c4);
		supermecado.agregarClientesAColaA(c5);
		
		supermecado.reacomodarColasAyB();
		
		assertEquals(2, supermecado.getColaB().get(1).getNumeroUbicacion());
		assertEquals(3, supermecado.getColaA().get(2).getNumeroUbicacion());
		assertEquals(9, supermecado.getColaA().get(2).getCantidadDeProductos());
	}

}
