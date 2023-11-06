package main.carrito.compras;

import java.util.Objects;

public class Producto {

	private String nom;
	private double precio;
	private Categoria categoria;

	public Producto(String nom, double precio, Categoria categoria) {
		this.nom = nom;
		this.precio = precio;
		this.categoria = categoria;
	}

	public String getNom() {
		return nom;
	}

	public double getPrecio() {
		return precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, nom, precio);
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
		return categoria == other.categoria && Objects.equals(nom, other.nom)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
