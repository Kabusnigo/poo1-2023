/** 3
 * Se tiene ordenada por código de producto, una lista donde cada Producto, 
 * tiene como atributos código, descripción, importe y stock. 
 * Implementar métodos para:
 */
package ejercicio.producto;

import java.util.ArrayList;
import java.util.List;

public class CompraGamer {

	private List<Producto> productos;

	public CompraGamer() {
		productos = new ArrayList<Producto>();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

//	1-Imprimir la lista completa.
	public void verListaDeProductos() {
		for (Producto producto : productos)
			System.out.println(producto);
	}

//	2-Dado un entero k, imprimir el k-ésimo elemento.
	public void verProducto(int elemento) {
		if (elemento > productos.size() || elemento < 0)
			throw new Error("El elemnto no existe en la lista.");
			
		System.out.println(productos.get(elemento - 1));
	}

//	3-Incrementar el importe de un producto dado en un 10%.
	public void incrementarImporte(Producto producto) {
		if (!productos.contains(producto))
			throw new Error("El producto no existe.");
		productos.get(productos.indexOf(producto)).incrementarImporte();
	}

//	4-Devolver el stock de un producto dado o cero si no esta.
	public int devolverStockDelProducto(Producto producto) {
		return (productos.contains(producto)) ? productos.get(productos.indexOf(producto)).getStock() : 0;
	}

//	5-Devolver una lista de productos con stock inferior a 50 unidades.
	public List<Producto> verProductosConStockMenorDe50() {
		List<Producto> aux = new ArrayList<Producto>();

		for (Producto producto : productos) {
			if (producto.getStock() < 50)
				aux.add(producto);
		}

		return aux;
	}

//	6-Devolver una lista de productos con stock superior o igual a 50 unidades.
	public List<Producto> verProductosConStockMayorDe50() {
		List<Producto> aux = new ArrayList<Producto>();

		for (Producto producto : productos) {
			if (producto.getStock() >= 50)
				aux.add(producto);
		}

		return aux;
	}

}
