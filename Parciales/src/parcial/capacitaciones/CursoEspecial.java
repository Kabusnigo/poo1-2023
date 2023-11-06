package parcial.capacitaciones;

import java.util.List;

public class CursoEspecial extends Curso {

	private float notaMinimaTrabajo;

	public CursoEspecial(String nombre, String modalidad, float notaMinimaCurso, float notaMinimaTrabajo) {
		super(nombre, modalidad, notaMinimaCurso);
		this.notaMinimaTrabajo = notaMinimaTrabajo;
	}

	public float getNotaMinimaTrabajo() {
		return this.notaMinimaTrabajo;
	}

	public void setNotaMinimaTrabajo(float nota) {
		this.notaMinimaTrabajo = nota;
	}

	@Override
	public boolean apruebaCurso(List<Float> nota) {
		float promedio = 0;
		promedio = obtenerCalificacionCurso(nota);
		return (super.apruebaCurso(nota) && (promedio >= notaMinimaTrabajo)) ? true : false;
	}

	@Override
	public float obtenerCalificacionCurso(List<Float> notas) {
		float promedioNotaTrabajoEspecial = 0;
		for (int i = 1; i < notas.size(); i++)
			promedioNotaTrabajoEspecial  += notas.get(i);
		promedioNotaTrabajoEspecial /= (notas.size() - 1);
		return promedioNotaTrabajoEspecial ;
	}

}
