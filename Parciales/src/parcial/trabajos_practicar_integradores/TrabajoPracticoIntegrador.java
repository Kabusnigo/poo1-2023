package parcial.trabajos_practicar_integradores;

public class TrabajoPracticoIntegrador extends TrabajoPractico {

	private float puntajeMinimoPorEjercicio;

	public TrabajoPracticoIntegrador(String tema, float puntajeDeAprobacion, float puntajeMinimoPorEjercicio) {
		super(tema, puntajeDeAprobacion);
		this.puntajeMinimoPorEjercicio = puntajeMinimoPorEjercicio;
	}

	@Override
	public boolean addEjercicio(Ejercicio ejercicio) {
		return (super.addEjercicio(ejercicio) && puntajeMinimoPorEjercicio < ejercicio.getPuntajeMaximo()) ? true
				: false;
	}

	
	
}
