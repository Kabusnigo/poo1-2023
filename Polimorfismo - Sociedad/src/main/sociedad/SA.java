package main.sociedad;

public class SA extends Sociedad {
	
	private int cantidadDeAcciones;
	private double precioPorCadaAccion;
	private boolean cotizaEnBolsa;
	private int cantidadDeDirectores;
	
	public SA(String denominacionSocial, String domicilioLegal, double capitalSocial, String cuit,
			int cantidadDeAcciones, double precioPorCadaAccion, boolean cotizaEnBolsa, int cantidadDeDirectores) {
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.cantidadDeAcciones = cantidadDeAcciones;
		this.precioPorCadaAccion = precioPorCadaAccion;
		this.cotizaEnBolsa = cotizaEnBolsa;
		this.cantidadDeDirectores = cantidadDeDirectores;
	}

	public int getCantidadDeAcciones() {
		return cantidadDeAcciones;
	}

	public void setCantidadDeAcciones(int cantidadDeAcciones) {
		this.cantidadDeAcciones = cantidadDeAcciones;
	}

	public double getPrecioPorCadaAccion() {
		return precioPorCadaAccion;
	}

	public void setPrecioPorCadaAccion(double precioPorCadaAccion) {
		this.precioPorCadaAccion = precioPorCadaAccion;
	}

	public boolean isCotizaEnBolsa() {
		return cotizaEnBolsa;
	}

	public void setCotizaEnBolsa(boolean cotizaEnBolsa) {
		this.cotizaEnBolsa = cotizaEnBolsa;
	}

	public int getCantidadDeDirectores() {
		return cantidadDeDirectores;
	}

	public void setCantidadDeDirectores(int cantidadDeDirectores) {
		this.cantidadDeDirectores = cantidadDeDirectores;
	}

	@Override
	public String toString() {
		return super.toString() + "----------Sociedad Anónima----------" +
				"\nCantidad de acciones: " + cantidadDeAcciones + "   Precio por cada acción: " + precioPorCadaAccion
				+ "\nCotiza en bolsa: " + cotizaEnBolsa + "   Cantidad de directores: " + cantidadDeDirectores + "\n";
	}

}
