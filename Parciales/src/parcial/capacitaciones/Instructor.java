package parcial.capacitaciones;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

	private int dni;
	private String nombre;
	private String apellido;
	private int cupoModalidadVirtual;
	private List<Capacitacion> capacitaciones;

	public Instructor(int dni, String nombre, String apellido, int cupoModalidadVirtual) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cupoModalidadVirtual = cupoModalidadVirtual;
		capacitaciones = new ArrayList<Capacitacion>();
	}

	public boolean inscribirACurso(Capacitacion capacitacion) {
		if (capacitacion.getCurso().getModalidad().equals("Virtual")) {
			if (!superoLimiteDeModalidadVirtual("Virtual")) {
				capacitaciones.add(capacitacion);
				return true;
			} else
				return false;
		} else {
			capacitaciones.add(capacitacion);
			return true;
		}
	}

	public boolean superoLimiteDeModalidadVirtual(String modalidad) {
		int cantDeModalidadVirtual = 0;
		for (Capacitacion capa : capacitaciones) {
			if (capa.getCurso().getModalidad().equals(modalidad)) {
				cantDeModalidadVirtual++;
			}
		}
		return (cantDeModalidadVirtual > cupoModalidadVirtual) ? true : false;
	}

}
