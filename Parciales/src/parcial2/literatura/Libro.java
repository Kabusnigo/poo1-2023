package parcial2.literatura;

import java.util.Objects;

/**
 * Se recibe una lista de libros que por diversos problemas de carga, contiene
 * muchos libros repetidos. Implementar el método eliminarLibrosRepetidos que
 * devuelva otra lista de Libros, pero sin libros repetidos y ordenada por ISBN.
 */

public class Libro implements Comparable<Libro>{

	private Long isbn;
	private String titulo;
	
	public Libro(Long isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public int compareTo(Libro p) {
		return Long.compare(this.isbn, p.getIsbn());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;
		Libro other = (Libro) obj;
		return isbn == other.getIsbn() && Objects.equals(titulo, other.getTitulo());
	}
	
	@Override
	public String toString() {
		return "Tit: " + titulo + ", ISBN: " + isbn;
	}
	
}
