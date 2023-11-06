package main.carrito.compras;

import java.util.Objects;

public class Producto {
	private String nom;
	private double precio;
	private Categoria cat;

	public Producto(String nom, double precio, Categoria cat) {
		this.nom = nom;
		this.precio = precio;
		this.cat = cat;
	}

	public String getNom() {
		return nom;
	}

	public double getPrecio() {
		return precio;
	}

	public Categoria getCat() {
		return cat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cat, nom, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cat == other.cat && Objects.equals(nom, other.nom)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
}
