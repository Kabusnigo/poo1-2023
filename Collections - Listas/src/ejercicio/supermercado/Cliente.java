package ejercicio.supermercado;

public class Cliente{

	private int cantidadDeProductos;
	private int numeroUbicacion;

	public Cliente(int cantidad) {
		this.cantidadDeProductos = cantidad;
		this.numeroUbicacion = 0;
	}

	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public int getNumeroUbicacion() {
		return this.numeroUbicacion;
	}
	
	public void setNumeroUbicacion(int numeroUbicacion) {
		this.numeroUbicacion = numeroUbicacion;
	}

}
