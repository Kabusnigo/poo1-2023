package parcial2.elparcial;

public class EspectadoresPorEntrada {

	private int[] puertas = new int[15];
	private int cantidadDeEspectadores = 0;
	
	public void ingresarEspectadoresPorLaPuerta(int puerta, int espectadores) {
		this.puertas[puerta - 1] += espectadores;
		this.cantidadDeEspectadores += espectadores;
	}
	
	public int getEspectdoresPorPuerta(int puerta) {
		return this.puertas[puerta - 1];
	}
	
	public int getCantidadDeEspectadore() {
		return this.cantidadDeEspectadores;
	}
	
}
