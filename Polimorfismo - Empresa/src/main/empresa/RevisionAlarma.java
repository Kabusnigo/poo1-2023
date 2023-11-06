package main.empresa;

import java.time.LocalDate;
import java.util.Locale;

public class RevisionAlarma extends Servicio {

	private int cantidadDeAlarmas;

	public RevisionAlarma(LocalDate fechaRevision, String cliente, int cantidadDeAlarmas) {
		super("Revisor Especialista Contraincendios", fechaRevision, cliente);
		this.cantidadDeAlarmas = cantidadDeAlarmas;
	}

	public void setCantidadDeAlarmas(int cantidadDeAlarmas) {
		this.cantidadDeAlarmas = cantidadDeAlarmas;
	}

	public int getCantidadDeAlarmas() {
		return cantidadDeAlarmas;
	}

	@Override
	public double costeMaterial() {
		return 0;
	}

	@Override
	public double costeManoObra() {
		return (cantidadDeAlarmas / 3) * 40;
	}

	@Override
	public double costeTotal() {
		return costeManoObra();
	}

	@Override
	public String detalleServicio() {
		return "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS"
				+ "\nCliente: " + this.getCliente()
				+ "\nFecha Revision: " + this.getFechaInicio()
				+ "\n---------------------------------------"
				+ "\nTOTAL: ......... " + String.format(Locale.US, "%.2f", this.costeTotal())
				+ "\n---------------------------------------\n\n";
	}

}
