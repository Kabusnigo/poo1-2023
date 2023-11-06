package parcial.capacitaciones;

import java.util.List;
import java.util.ArrayList;

public class Capacitacion {

	private List<Float> notasCurso;
	private Curso curso;
	
	public Capacitacion(Curso curso) {
		notasCurso = new ArrayList<Float>();
		this.curso = curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void agregarNota(Float nota) {
		this.notasCurso.add(nota);
	}
	
	public List<Float> getNotasCurso(){
		return this.notasCurso;
	}
	
	public Curso getCurso() {
		return this.curso;
	}
	
}
