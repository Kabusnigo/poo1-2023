package main.empresa;

import java.time.LocalDate;
import java.util.Locale;

public class TrabajoPintura extends Servicio {

	private double superficie;
	private double precioPintura;

	public TrabajoPintura(String trabajador, LocalDate fechaIncio, String cliente, double superficie,
			double precioPintura) {
		super(trabajador, fechaIncio, cliente);
		this.superficie = superficie;
		this.precioPintura = precioPintura;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getSuperficie() {
		return this.superficie;
	}

	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
	}

	public double getPrecioPintura() {
		return precioPintura;
	}

	@Override
	public double costeMaterial() {
		return (this.superficie / 7.8) * precioPintura;
	}

	@Override
	public double costeManoObra() {
		return (this.superficie / 10) * 9.5;
	}

	@Override
	public double costeTotal() {
		if (this.superficie < 50) 
			return (this.costeManoObra() + this.costeMaterial()) * 1.15;
		
		return this.costeManoObra() + this.costeMaterial();
	}

	@Override
	public String detalleServicio() {
		return "TRABAJAO PINTURA"
				+ "\nCliente: " + this.getCliente()
				+ "\nFecha de Inicio: " + this.getFechaInicio()
				+ "\n--------------------------------------------------------"
				+ "\nPintor: " + this.getTrabajador()
				+ "\nCoste Material..... " + String.format(Locale.US, "%.2f",this.costeMaterial())
				+ "\nCoste Mano Obra.... " + String.format(Locale.US, "%.2f", this.costeManoObra())
				+ "\nCoste Adicional.... " + String.format(Locale.US, "%.2f", (this.costeTotal() - this.costeMaterial() - this.costeManoObra()))
				+ "\nTOTAL.............. " + String.format(Locale.US, "%.2f", this.costeTotal())
				+ "\n---------------------------------------\n\n";
	}

}
