package main.videoclub;

public class Pelicula implements Comparable<Pelicula>, Entregable {

	private String titulo;
	private Integer anio;
	private Boolean entregado;
	private String genero;
	private String director;

	public Pelicula(String titulo, Integer anio, Boolean entregado, String genero, String director) {
		this.titulo = titulo;
		this.anio = anio;
		this.entregado = entregado;
		this.genero = genero;
		this.director = director;
	}

	public Pelicula(String titulo, String director) {
		this.titulo = titulo;
		this.director = director;
		this.entregado = false;
		this.genero = "no definido";
	}

	public Pelicula(String titulo, Integer anio, String genero, String director) {
		this.titulo = titulo;
		this.anio = anio;
		this.genero = genero;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", anio=" + anio + ", entregado=" + entregado + ", genero=" + genero
				+ ", director=" + director + "]";
	}

	@Override
	public int compareTo(Pelicula o) {
		return Double.compare(this.anio, o.anio);
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
