package parcial.futbol;

import java.util.Date;
import java.util.List;

public class Reserva {

	private Date fechaReserva;
	private Equipo equipo1;
	private Equipo equipo2;

	public Reserva(Date fecha, Equipo equipo1, Equipo equipo2) {
		this.fechaReserva = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}
	
	public void setFechaReserva(Date fecha) {
		this.fechaReserva = fecha;
	}
	
	public Equipo getEquipo1() {
		return this.equipo1;
	}
	
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return this.equipo2;
	}
	
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
	public boolean realizarReserva(Date fecha, Equipo eq1, Equipo eq2) {
		if(!this.hayJugadorRepetido(eq1, eq2)) {
			this.setFechaReserva(fecha);
			this.setEquipo1(eq1);
			this.setEquipo2(eq2);
			return true;
		}
		return false;
	}
	
	public boolean hayJugadorRepetido(Equipo eq1, Equipo eq2) {
		for (String jugadorEquipo1 : eq1.getJugador()) {
			for(String jugadorEquipo2 : eq2.getJugador()) {
				if (jugadorEquipo2.equals(jugadorEquipo1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	// OTRA ALTERNATIVA
	public boolean hayJugadorRepetido2() {
		for (String jugadorEquipo1 : equipo1.getJugador()) {
			if (equipo2.getJugador().contains(jugadorEquipo1)) {
				return false;
			}
		}
		return true;
	}
	
}
