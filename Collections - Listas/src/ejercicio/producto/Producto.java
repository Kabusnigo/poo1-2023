/** 3
 * Se tiene ordenada por código de producto, una lista donde cada Producto, 
 * tiene como atributos código, descripción, importe y stock. 
 * Implementar métodos para:

  1-Imprimir la lista completa.
  2-Dado un entero k, imprimir el k-ésimo elemento.
  3-Incrementar el importe de un producto dado en un 10%.
  4-Devolver el stock de un producto dado o cero si no esta.
  5-Devolver una lista de productos con stock inferior a 50 unidades.
  6-Devolver una lista de productos con stock superior o igual a 50 unidades.
 */

package ejercicio.producto;

import java.util.Objects;

public class Producto {

	private int codigo;
	private String descripcion;
	private double importe;
	private int stock;
	
	public Producto(int codigo, String descripcion, double importe, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.importe = importe;
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void incrementarImporte() {
		this.importe *= 1.1;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Descripcion: " + descripcion + ", Importe: " + importe + ", stock: "
				+ stock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, importe, stock);
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
		return codigo == other.codigo && Objects.equals(descripcion, other.descripcion)
				&& Double.doubleToLongBits(importe) == Double.doubleToLongBits(other.importe) && stock == other.stock;
	}
	
	
}
