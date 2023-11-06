/*
 * Se tiene un jugador de futbol definido por cantidad de goles 
 * y la cantidad de infracciones que hizo y cantidad de partidos
 * en que jugó; además, se cuenta con un equipo de fútbol con 11
 * jugadores. De un campeonato con 10 equipos de fútbol se desea
 * determinar cual es el equipo que hizo “juego sucio” y para 
 * cada equipo determinar “una figura”, para esto se deberá 
 * codificar los métodos:
 * 
 * esBuenjugador(): retorna true si hizo al menos 10 goles y 
 * cometió menos de 5 infracciones, retorna false en otro caso.
 * 
 * una Figura(): devuelve el número de jugador más goleador
 * entre todos los “buenos jugadores” del equipo.
 * 
 * juegoSucio(): retorna true si todos los jugadores de un mismo 
 * equipo que hicieron algún gol y jugaron más de 2 partidos, 
 * cometieron alguna infracción, retorna false en otro caso.
 * 
 * Los datos para los 10 equipos del campeonato se generaran al 
 * azar y en un archivo de salida se guardaran los datos del 
 * campeonato.
 * 
 * Se deberán codificar las clases y métodos necesarios.
 */

package entidades.campeonato;

public class Jugador {
	private int nro;
	private int goles;
	private int infracciones;
	private int partidos;
	
	public Jugador () {
		this.nro=(int)(Math.random()*100+1);
		this.goles=(int)(Math.random()*21);
		this.infracciones=(int)(Math.random()*60+1);
		this.partidos=(int)(Math.random()*18+1);
	}
	
	
}
