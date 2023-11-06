package bibliotecaNocturna;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class bibliotecaTest {

	@Test //1
	public void bibliotecaNuevatest() {
		Biblioteca biblioteca = new Biblioteca(10);
		int waiting = 0;
		int result = biblioteca.cuantosLibros();
		assertEquals(waiting, result);
	}

	@Test //2
	public void agregarUnLibroTest() {
		Biblioteca biblioteca = new Biblioteca(10);
		biblioteca.agregarLibro("Moby Dick", "Melville", Genero.AVENTURA, 909);
		int waiting = 1;
		int result = biblioteca.cuantosLibros();
		assertEquals(waiting, result);
	}
	
	@Test //3
	public void libroEnLaPrimeraPosicionTest() {
		Biblioteca biblioteca = new Biblioteca(10);
		biblioteca.agregarLibro("Moby Dick", "Melville", Genero.AVENTURA, 909);
		assertEquals("Moby Dick", biblioteca.libroEnLaPosicion(1));
	}
	
	@Test //4
	public void libroConMasPaginas() {
		Biblioteca biblioteca = new Biblioteca(10);
		biblioteca.agregarLibro("Moby Dick", "Melville", Genero.AVENTURA, 909);
		biblioteca.agregarLibro("Mob", "Melv", Genero.INFANTILES, 900);
		biblioteca.agregarLibro("Dick", "Ville", Genero.CIENCIAFICCION, 929);
		
		Libro esperadoLibro = new Libro("Dick", "Ville", Genero.CIENCIAFICCION, 929);
		// El EQUALS ME OBLIGO A USAR UN EQUALS EN LA CLASE LIBRO
		//PORQUE SINO NO SABE CÓMO COMPARAR
		assertEquals(esperadoLibro, biblioteca.libroConMasPaginas());
	}
	
	@Test //5
	public void libroConMasPaginasVacio() {
		Biblioteca biblioteca = new Biblioteca(10);
		assertEquals(null, biblioteca.libroConMasPaginas());
	}
	
	@Test
	public void bibliotecaLlenaTest() {
		Biblioteca elBiblio = new Biblioteca(2);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIAFICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		assertThrows(Error.class, () -> elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.NOVELA, 200));
	}
}
