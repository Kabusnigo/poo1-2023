package parcial.capacitaciones;

import java.util.List;

public class Curso {

	private String nombre;
	private String modalidad;
	private float minimaNotaCurso;
	
	public Curso(String nombre, String modalidad, float minimaNotaCurso) {
		this.nombre = nombre;
		this.modalidad = modalidad;
		this.minimaNotaCurso = minimaNotaCurso;
	}
	
	public String getModalidad() {
		return this.modalidad;
	}
	
	public float getNotaMinimaCurso() {
		return this.minimaNotaCurso;
	}
	
	public void setNotaMinimaCurso(float nota) {
		this.minimaNotaCurso = nota;
	}
	
	public float obtenerCalificacionCurso(List<Float> nota) {
		return nota.get(0);
	}
	
	public boolean apruebaCurso(List<Float> notas) {
		return (obtenerCalificacionCurso(notas) >= this.minimaNotaCurso) ? true : false;
	}
	
}
