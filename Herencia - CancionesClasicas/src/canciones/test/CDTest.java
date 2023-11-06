package canciones.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canciones.main.CD;
import canciones.main.Clasica;

class CDTest {
	
	private CD cd;
	
	@BeforeEach
	public void crearClasica () {
		cd = new CD();
	}

	@Test
	public void crearCancionTest() {
		cd.crearCancion(134, "Innuendo", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
		assertEquals(1, cd.cantidadDeCanciones());
	}
	
	@Test
	public void eliminarUnaCancionTest() {
		cd.crearCancion(134, "Innuendo", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
		cd.eliminarCancionPorReferencia(134);
		assertEquals(0, cd.cantidadDeCanciones());
	}
	
	@Test
	public void listarCancionesTest() {
		cd.crearCancion(134, "Innuendo", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
		cd.crearCancion(2102, "The Show Must Go On", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
		cd.crearCancion(5199, "Delilah", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
		cd.listarTodasLasCanciones();
	}

}
