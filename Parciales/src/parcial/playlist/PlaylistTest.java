package parcial.playlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class PlaylistTest {

	private Playlist playlist;

	public PlaylistTest() {
		playlist = new Playlist(3);
	}

	@Test
	void getCantidadDeCancionesTest() {
		playlist.agregarCancion("Akira Yamaoka", "White Noise", 145);
		playlist.agregarCancion("Akira Yamaoka", "Room of Angel", 570);
		
		assertEquals(2, playlist.getCantidadDeCanciones());
	}

	@Test
	void getCantidadDeCancionesErrorTest() {
		playlist.agregarCancion("Akira Yamaoka", "White Noise", 145);
		playlist.agregarCancion("Akira Yamaoka", "Room of Angel", 570);
		playlist.agregarCancion("Akira Yamaoka", "Main Theme", 270);
		
		assertThrows(Error.class, () -> playlist.agregarCancion("Akira Yamaoka", "Heaven's Night", 390));
	}

	@Test
	void cancionEnLaPosicionTest() {
		playlist.agregarCancion("Akira Yamaoka", "White Noise", 145);
		playlist.agregarCancion("Akira Yamaoka", "Room of Angel", 570);
		playlist.agregarCancion("Akira Yamaoka", "Main Theme", 270);
		Cancion esperadoCancion = new Cancion("Akira Yamaoka", "Main Theme", 270);

		assertEquals(esperadoCancion, playlist.cancionEnLaPosicion(3));
	}

	@Test
	void cancionDeMayorDuracionTest() {
		playlist.agregarCancion("Akira Yamaoka", "White Noise", 145);
		playlist.agregarCancion("Akira Yamaoka", "Room of Angel", 570);
		playlist.agregarCancion("Akira Yamaoka", "Main Theme", 270);
		
		Cancion mayorDuracionCancion = new Cancion("Akira Yamaoka", "Room of Angel", 570);
		
		assertEquals(mayorDuracionCancion, playlist.cancionDeMayorDuracion());
	}
	
	@Test
	void tiempoParaEscucharTodaLaPlaylistTest() {
		playlist.agregarCancion("Akira Yamaoka", "White Noise", 145);
		playlist.agregarCancion("Akira Yamaoka", "Room of Angel", 570);
		playlist.agregarCancion("Akira Yamaoka", "Main Theme", 270);
		
		assertEquals("Min: 16 Seg: 25", playlist.tiempoParaEscucharTodaLaPlaylist());
	}
	
	@Test
	void cancionsDelInterpreteTest() {
		playlist.agregarCancion("Akira Yamaoka", "White Noise", 145);
		playlist.agregarCancion("Queen", "Innuedo", 460);
		playlist.agregarCancion("Akira Yamaoka", "Main Theme", 270);
		
		Cancion[] esperadaPlaylist = new Cancion[2];
		esperadaPlaylist[0] = new Cancion("Akira Yamaoka", "White Noise", 145);
		esperadaPlaylist[1] = new Cancion("Akira Yamaoka", "Main Theme", 270);
		
		assertArrayEquals(esperadaPlaylist, playlist.cancionesDelInterprete("Akira Yamaoka"));
	}

}
