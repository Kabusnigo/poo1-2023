package test.carrito.compras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import main.carrito.compras.Carrito;
import main.carrito.compras.Categoria;
import main.carrito.compras.Producto;

class CarritoTest {

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
		carrito.agregarProducto(new Producto("yerba", 1300.0, Categoria.ALIMENTO));
		assertEquals(1, carrito.getCantidadProductos());
	}

	@Test
	public void VerificarPrecioTotalDelCarrito() {
		carrito.agregarProducto(new Producto("fideos", 500.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("pure de tomate", 300.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("cebolla", 800.0, Categoria.ALIMENTO));
		assertEquals(1600.0, carrito.getPrecioTotal());
	}

	public void verificarPrecioTotalProductosTecnologia() {
		carrito.agregarProducto(new Producto("fideos", 500.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("TV", 80000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("pure de tomate", 300.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("cuchara de madera", 5000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("cebolla", 800.0, Categoria.ALIMENTO));
		assertEquals(85000.0, carrito.getPrecioTotal(Categoria.TECNOLOGIA));
	}

}
