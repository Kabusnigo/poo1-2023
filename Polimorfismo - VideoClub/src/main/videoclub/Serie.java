package main.videoclub;

public class Serie implements Comparable<Serie>, Entregable {

	private String titulo;
	private Integer temporadas;
	private Boolean entregado;
	private String genero;
	private String creador;
	
	public Serie(String titulo, Integer temporadas, Boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.temporadas = 3;
		this.entregado = false;
	}

	public Serie(String titulo, Integer temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Integer temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	@Override
	public int compareTo(Serie o) {
		return Double.compare(this.temporadas, o.temporadas);
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
	
}
