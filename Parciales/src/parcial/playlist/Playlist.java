package parcial.playlist;

import java.util.Arrays;

public class Playlist {

	private Cancion[] canciones;
	private int cantidadDeCanciones;

	public Playlist(int maxCantidadDeCanciones) {
		canciones = new Cancion[maxCantidadDeCanciones];
		cantidadDeCanciones = 0;
	}

	public int getCantidadDeCanciones() {
		return cantidadDeCanciones;
	}

	public void agregarCancion(String interprete, String titulo, int duracion) {
		if (canciones.length <= cantidadDeCanciones) {
			throw new Error("La playlist está llena.");
		}

		canciones[cantidadDeCanciones] = new Cancion(interprete, titulo, duracion);
		cantidadDeCanciones++;
	}

	public Cancion cancionEnLaPosicion(int posicion) {
		if (posicion < 1 || posicion > cantidadDeCanciones) {
			throw new Error("No existe esta posicion.");
		}
		return canciones[posicion - 1];
	}

	public Cancion cancionDeMayorDuracion() {
		Arrays.sort(canciones);
		return canciones[cantidadDeCanciones-1];
	}

	public Cancion[] cancionesDelInterprete(String interprete) {
		Arrays.sort(canciones);
		Cancion[] nuevasCanciones = new Cancion[cantidadDeCancionesDelInterprete(interprete)];
		int j=0;
		
		for(int i=0; i<cantidadDeCanciones; i++) {
			if(canciones[i].getInterprete().equalsIgnoreCase(interprete))
				nuevasCanciones[j] = canciones[i];
				j++;
		}
		
		return nuevasCanciones;
	}
	
	private int cantidadDeCancionesDelInterprete(String interprete) {
		int cantidad=0;
		
		for(Cancion cancion : canciones) {
			if(cancion.getInterprete().equalsIgnoreCase(interprete))
				cantidad ++;
		}
		
		return cantidad;
	}

	public String tiempoParaEscucharTodaLaPlaylist() {
		int mm;
		int ss;
		int acumSs = 0;

		for (Cancion cancion : canciones) {
			acumSs += cancion.getDuracion();
		}

		mm = acumSs / 60;
		ss = acumSs % 60;

		return "Min: " + mm + " Seg: " + ss;
	}
	
	

}
