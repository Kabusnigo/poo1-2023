package main.empresa;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Servicio {

	private String trabajador;
	private LocalDate fechaInicio;
	private String cliente;
	
	public Servicio (String trabajador, LocalDate fechaIncio, String cliente) {
		this.trabajador = trabajador;
		this.fechaInicio = fechaIncio;
		this.cliente = cliente;
	}
	
	public void setTrabajador(String t) {
		this.trabajador = t;
	}
	
	public String getTrabajador() {
		return this.trabajador;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	
	public abstract double costeMaterial();
	
	public abstract double costeManoObra();
	
	public abstract double costeTotal();
	
	public abstract String detalleServicio();

	@Override
	public int hashCode() {
		return Objects.hash(cliente, fechaInicio, trabajador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servicio other = (Servicio) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(fechaInicio, other.fechaInicio)
				&& Objects.equals(trabajador, other.trabajador);
	}

	@Override
	public String toString() {
		return "Servicio [trabajador=" + trabajador + ", fechaInicio=" + fechaInicio + ", cliente=" + cliente + "]";
	}
	
	
	
}
