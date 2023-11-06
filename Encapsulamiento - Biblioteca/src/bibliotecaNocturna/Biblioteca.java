package bibliotecaNocturna;

public class Biblioteca {
	private Libro[] libros;
	private int cantidadDeLibros;

	public Biblioteca(int maxCantidadDeLibros) {
		libros = new Libro[maxCantidadDeLibros];
		cantidadDeLibros = 0;
	}
	
	public int cuantosLibros() {
		return cantidadDeLibros;
	}
	
	public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		if (cantidadDeLibros >= libros.length)
			throw new Error("Biblioteca completa");

		Libro nuevoLibro = new Libro(titulo, autor, genero, paginas);
		libros[cantidadDeLibros] = nuevoLibro;
		cantidadDeLibros++;
		return true;
	}

	public void agregarLibro(Libro libro) {
		if (cantidadDeLibros >= libros.length)
			throw new Error("Biblioteca completa");
		libros[cantidadDeLibros] = libro;
		cantidadDeLibros++;
	}

	public String libroEnLaPosicion(int posicion) {
		return libros[posicion - 1].getTitulo();
	}

	public Libro libroConMasPaginas() {
		Libro maxLibro = libros[0];
		for (int i = 1; i < cantidadDeLibros; i++) {
			if (libros[i].getPaginas() > maxLibro.getPaginas()) {
				maxLibro = libros[i];
			}
		}
		return maxLibro;
	}

	// 6. Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor) {
		int librosDelAutor = 0;
		for (Libro libro : libros) {
			if (libro.getAutor().equalsIgnoreCase(autor)) {
				librosDelAutor++;
			}
		}
		return librosDelAutor;
	}

	// 7. Devuelva un arreglo con todos los Libros de un autor que se pasa por
	// parámetro.
	public Libro[] librosDelAutor(String autor) {
		// TODO
	}
	// 8. Calcule el tiempo (en minutos) que llevaría leer todos los
	// libros, asumiendo que se tarda 1 minuto por página.1

	public int tiempoEnLeetTodosLosLibros() {
		// TODO
	}

	// 9. Informe por pantalla la cantidad de libros que hay por cada Genero
	// literario.
	public void librosPorGeneroLiterario() {
		// TODO
	}
	// 10. Para cada uno de los puntos anteriores confeccionar los casos de prueba
	// JUnit que aseguren su correcto funcionamiento.
}
