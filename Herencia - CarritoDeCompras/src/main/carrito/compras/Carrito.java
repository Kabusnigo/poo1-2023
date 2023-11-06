package main.carrito.compras;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> productos;

	public Carrito() {
		productos = new ArrayList<Producto>();
	}

	public int getCantidadProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);

	}

	public Double getPrecioTotal() {
		double acumuladorPrecio = 0;
		for (Producto producto : productos)
			acumuladorPrecio += producto.getPrecio();
		return acumuladorPrecio;
	}

	public Double getPrecioTotal(Categoria categoria) {
		double acumuladorPrecio = 0;
		for (Producto producto : productos)
			if (producto.getCategoria().equals(categoria))
				acumuladorPrecio += producto.getPrecio();
		return acumuladorPrecio;

	}
}
