package parcial.lllmil;

import java.util.List;
import java.util.ArrayList;

public class Colegio {

	private List<Curso> cursos;

	public Colegio() {
		cursos = new ArrayList<Curso>();
	}

	public int cantidadDeEstudiantesPorCurso(String nombreCurso) {
		int cantidad = 0;
		
		for (Curso c : cursos) {
			if (c.getNombreCurso().equals(nombreCurso)) {
				cantidad = c.getCantidadDeInscripciones();
			}
		}
		return cantidad;
	}
	
	public int cantidadDeEstudiantesAprobados(String nombreCurso) {
		int cantidad = 0;
		
		for (Curso curso : cursos) {
			if (curso.getNombreCurso().equals(nombreCurso)) {
				for (Inscripcion inscripcion : curso.getInscripciones()) {
					if (inscripcion.getNota() >= curso.getNotaAprobacion()) {
						cantidad++;
					}
				}
			}
		}
		
		return cantidad;
	}

}
