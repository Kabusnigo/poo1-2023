package parcial.playlist;

import java.util.Objects;

public class Cancion implements Comparable<Cancion> {

	private String interprete;
	private String titulo;
	private int duracion;

	public Cancion(String interprete, String titulo, int duracion) {
		this.interprete = interprete;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getInterprete() {
		return this.interprete;
	}

	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public int compareTo(Cancion o) {
		return Integer.compare(this.duracion, o.duracion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, interprete, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return duracion == other.duracion && Objects.equals(interprete, other.interprete)
				&& Objects.equals(titulo, other.titulo);
	}

}
