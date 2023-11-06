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

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public Double getPrecioTotal() {
		Double acumuladorPrecio = 0.0;
		for (Producto producto : productos) {
			acumuladorPrecio += producto.getPrecio();
		}
		return acumuladorPrecio;
	}

	public Double getPrecioTotal(Categoria tecnologia) {
		Double acumuladorPrecio = 0.0;
		for (Producto producto : productos) {
			if (producto.getCat().equals(tecnologia)) {
				acumuladorPrecio += producto.getPrecio();
			}
		}
		return acumuladorPrecio;
	}

}
