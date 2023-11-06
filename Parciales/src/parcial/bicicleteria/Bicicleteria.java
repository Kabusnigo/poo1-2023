package parcial.bicicleteria;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {

	private List<Bicicleta> bicicletas;
	private double ganancias;
	private Integer cantidadDeVentas;

	public Bicicleteria() {
		this.bicicletas = new ArrayList<Bicicleta>();
		this.cantidadDeVentas = 0;
		this.ganancias = 0;
	}

	public List<Bicicleta> getBicicletas() {
		return this.bicicletas;
	}

	public void addBicicleta(Bicicleta nuevaBici) {
		this.bicicletas.add(nuevaBici);
	}

	public void venderBicicleta(Bicicleta bicicleta) {
		this.bicicletas.remove(bicicleta);
		this.ganancias += bicicleta.getPrecio();
		this.cantidadDeVentas++;
	}

	public Bicicleta buscarBicicleta(String nroDeSerie) {
		for (Bicicleta item : bicicletas) {
			if (item.getNroDeSerie().equals(nroDeSerie)) {
				return item;
			}
		}
		return null;
	}

}
