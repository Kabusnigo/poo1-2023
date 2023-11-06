package parcial.academia_artistas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcademiaTest {

	@Test
	void agregarArtitaTest() {
		Academia academia = new Academia(2);
		Artista pi = new Pintor(34, 1);
		
		academia.agregarArtita(pi);
		
		assertEquals(1, academia.getArtistas().size());
	}
	
	@Test
	void agregarArtitaErrorTest() {
		Academia academia = new Academia(1);
		Artista pi = new Pintor(34, 1);
		Artista pi2 = new Pintor(34, 1);
		
		academia.agregarArtita(pi);
		
		assertThrows(Error.class, () -> academia.agregarArtita(pi2));
	}
	
	@Test
	void getTotalCuotaMensualDeArtistasTest() {
		Academia academia = new Academia(2);
		Artista pi = new Pintor(34, 1);
		Artista pi2 = new Escultor(34, 1);
		
		academia.agregarArtita(pi);
		academia.agregarArtita(pi2);
		
		assertEquals(22000.0, academia.getTotalCuotaMensualDeArtistas());
	}
	
	
	
	

}
