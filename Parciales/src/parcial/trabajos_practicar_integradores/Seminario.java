package parcial.trabajos_practicar_integradores;

import java.util.ArrayList;
import java.util.List;

public class Seminario {

	private String tema;
	private List<String> temasRequisito;
	private List<Alumno> alumnos;
	
	public Seminario(String tema) {
		this.tema = tema;
		this.temasRequisito = new ArrayList<String>();
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public boolean addRequisito(String requisito) {
		this.temasRequisito.add(requisito);
		return true;
	}
	
}
