package test.carrito.compras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.carrito.compras.Carrito;
import main.carrito.compras.Categoria;
import main.carrito.compras.Producto;

class CarritoComprasTest {

	private Carrito carrito;

	@BeforeEach
	public void crearCarrito() {
		carrito = new Carrito();
	}

	@Test
	public void verificarCantidad0EnCarritoVacio() {
		assertEquals(0, carrito.getCantidadProductos());
	}

	@Test
	public void verificarCantidad1EnCarrito() {
		carrito.agregarProducto(new Producto("Yerba", 1300.0, Categoria.ALIMENTO));
		assertEquals(1, carrito.getCantidadProductos());
	}

	@Test
	public void verificarPrecioTotalDelCarrito() {
		carrito.agregarProducto(new Producto("Fideo", 500.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("Pure de Tomate", 300.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("Cebolla", 800.0, Categoria.ALIMENTO));
		assertEquals(1600.0, carrito.getPrecioTotal());
	}

	@Test
	public void verificarPrecioTotalProductosTecnologia() {
		carrito.agregarProducto(new Producto("Fideo", 500.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("TV", 80000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("Pure de Tomate", 300.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("Cuchara de Madera", 5000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("Cebolla", 800.0, Categoria.ALIMENTO));
		assertEquals(85000.0, carrito.getPrecioTotal(Categoria.TECNOLOGIA));
	}
}
