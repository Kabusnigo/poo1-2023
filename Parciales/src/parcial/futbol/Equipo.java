package parcial.futbol;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private List<String> jugadores;
	private int max_jugadores;

	public Equipo(String nombre, int jugadores) {
		this.nombre = nombre;
		this.max_jugadores = jugadores;
		this.jugadores = new ArrayList<String>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void addJugador(String jugador) {
		if (this.noHayEquipo())
			this.jugadores.add(jugador);
		throw new Error("El equipo ya está completado.");
	}

	public List<String> getJugador() {
		return this.jugadores;
	}

	public void setMaxJugadores(int max_jugadores) {
		this.max_jugadores = max_jugadores;
	}

	public int getMaxJugadores() {
		return this.max_jugadores;
	}
	
	public boolean noHayEquipo() {
		return max_jugadores >= jugadores.size();
	}

}
