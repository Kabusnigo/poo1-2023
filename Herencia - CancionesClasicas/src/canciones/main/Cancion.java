package canciones.main;

public abstract class Cancion {

	protected long numeroReferencia;
	protected String titulo;
	protected String album;
	protected String grupo;

	public Cancion(long numeroReferencia, String titulo, String album, String grupo) {
		this.numeroReferencia = numeroReferencia;
		this.titulo = titulo;
		this.album = album;
		this.grupo = grupo;
	}
	
	protected long getNumeroReferencia() {
		return this.numeroReferencia;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAlbum() {
		return album;
	}

	public String getGrupo() {
		return grupo;
	}

	public abstract String imprimirCancion();

}
