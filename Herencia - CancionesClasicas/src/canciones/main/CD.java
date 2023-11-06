package canciones.main;

import java.util.ArrayList;

public class CD {

	private ArrayList<Clasica> canciones;

	public CD() {
		canciones = new ArrayList<Clasica>();
	}
	
	public ArrayList<Clasica> getCanciones() {
		return canciones;
	}

	public void crearCancion(long numeroReferencia, String titulo, String album, String grupo, String instrumentos) {
		canciones.add(new Clasica(numeroReferencia, titulo, album, grupo, instrumentos));
	}

	public void eliminarCancionPorReferencia(long numeroReferencia) {
		
		canciones.removeIf(cancion -> cancion.getNumeroReferencia() == numeroReferencia);
//		for (Clasica clasica : canciones) {
//			if (clasica.getNumeroReferencia() == numeroReferencia) {
//				canciones.remove(clasica);
//				break;
//			}
//		}
	}
	
	public void listarTodasLasCanciones() {
		for (Clasica clasica : canciones) {
			System.out.println(clasica.imprimirCancion());
		}
	}

	public Integer cantidadDeCanciones() {
		return canciones.size();
	}
	
	
}
