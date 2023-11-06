package parcial.academia_artistas;

import java.util.ArrayList;
import java.util.Collections;

public class Academia {

	private ArrayList<Artista> artistas;
	private int limite;

	public Academia(int limite) {
		this.limite = limite;
		this.artistas = new ArrayList<Artista>();
	}

	public void agregarArtita(Artista a) {
		if (artistas.size() >= limite) {
			throw new Error("Academia llena");
		}
		artistas.add(a);
	}

	public double getTotalCuotaMensualDeArtistas() {
		double total = 0;
		
		for (Artista artista : artistas) {
			total += artista.getCuotaMensual();
		}

		return total;
	}

	public void listarPlanillaDeArtistas() {
		Collections.sort(artistas);
		for (Artista artista : artistas) {
			System.out.println(artista);
		}
	}
	
	public ArrayList<Artista> getArtistas(){
		return artistas;
	}

}
