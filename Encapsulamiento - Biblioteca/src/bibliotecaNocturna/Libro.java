package bibliotecaNocturna;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private Genero genero;
	private int paginas;
	
	
	public Libro(String titulo, String autor, Genero genero, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
	}


	public String getTitulo() {
		return titulo;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public String getAutor() {
		return autor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, genero, paginas, titulo);
	}


	
	
	
}
