package parcial.lllmil;

public class Inscripcion {

	private Alumno alumno;
	private Curso curso;
	private double nota;

	public Inscripcion() {}

	public void setAlumno(Alumno a) {
		this.alumno = a;
	}

	public void setCurso(Curso c) {
		this.curso = c;
	}

	public void setNota(double n) {
		this.nota = n;
	}
	
	public double getNota() {
		return this.nota;
	}
	
}
