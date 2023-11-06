package ejercicio.producto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompraGamerTest {

	private CompraGamer compraGamer;
	
	@BeforeEach
	public void CompraGamer() {
		compraGamer = new CompraGamer();
	}
	
	@Test
	void agregarProductoTest() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		
		assertEquals(1, compraGamer.getProductos().size());
	}
	
	@Test
	void verListaDeProductosTest() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		//compraGamer.verListaDeProductos();
		
		assertEquals(3, compraGamer.getProductos().size());
	}
	
	@Test
	void verProductoTest() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		//compraGamer.verProducto(2);
	}
	
	@Test
	void verProductoErrorTest() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		assertThrows(Error.class, () -> compraGamer.verProducto(4));
	}
	
	@Test
	void imcrementarImporteTest() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		Producto productoIncrementado = new Producto(1, "Cooler Master 5H-0", 50000.34, 51);
		
		compraGamer.incrementarImporte(productoIncrementado);
		
		assertEquals(productoIncrementado.getImporte() * 1.1, compraGamer.getProductos().get(1).getImporte());
	}
	
	@Test
	void imcrementarImporteErrorTest() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		assertThrows(Error.class, () -> compraGamer.incrementarImporte(new Producto(9, "Cable Molex", 900, 35)));
	}
	
	@Test
	void devolverStockDelProductoTest() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		Producto productoRequerido = new Producto(10, "Auricular GH-10", 9900, 34);
		
		assertEquals(34, compraGamer.devolverStockDelProducto(productoRequerido));
	}
	
	@Test
	void verProductosConStockMenorDe50Test() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		for (Producto producto : compraGamer.verProductosConStockMenorDe50())
			System.out.println(producto);
	}
	
	@Test
	void verProductosConStockMayorDe50Test() {
		compraGamer.agregarProducto(new Producto(12, "Auricular GH-20", 8900.34, 21));
		compraGamer.agregarProducto(new Producto(1, "Cooler Master 5H-0", 50000.34, 51));
		compraGamer.agregarProducto(new Producto(10, "Auricular GH-10", 9900, 34));
		
		for (Producto producto : compraGamer.verProductosConStockMayorDe50())
			System.out.println(producto);
	}

}
