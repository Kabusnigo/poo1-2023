package parcial.lllmil;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nombreCurso;
	private int cupo;
	private double notaAprobacion;
	private List<Inscripcion> inscripciones;
	
	public Curso (double nota, int cupo, String nombre) {
		notaAprobacion = nota;
		this.cupo = cupo;
		nombreCurso = nombre;
		inscripciones = new ArrayList<Inscripcion>();
	}
	
	public void setNombreCurso(String n) {
		this.nombreCurso = n;
	}
	
	public String getNombreCurso() {
		return this.nombreCurso;
	}
	
	public double getNotaAprobacion() {
		return this.notaAprobacion;
	}
	
	public List<Inscripcion> getInscripciones(){
		return inscripciones;
	}
	
	public int getCantidadDeInscripciones() {
		return inscripciones.size();
	}
	
	
}
