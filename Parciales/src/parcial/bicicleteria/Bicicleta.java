package parcial.bicicleteria;

public class Bicicleta {

	private String nroDeSerie;
	private String modelo;
	private int anio;
	private double precio;

	public Bicicleta(String nroDeSerie, String modelo, int anio) {
		this.nroDeSerie = nroDeSerie;
		this.modelo = modelo;
		this.anio = anio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public String getNroDeSerie() {
		return this.nroDeSerie;
	}
	
	public String getModelo() {
		return modelo;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicicleta other = (Bicicleta) obj;
		return nroDeSerie.equals(other.getNroDeSerie());
	}

}
