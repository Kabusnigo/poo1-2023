package canciones.main;

import java.util.Objects;

public class Clasica extends Cancion {

	private String instrumentos;

	public Clasica(long numeroReferencia, String titulo, String album, String grupo, String instrumentos) {
		super(numeroReferencia, titulo, album, grupo);
		this.instrumentos = instrumentos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(instrumentos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clasica other = (Clasica) obj;
		return Objects.equals(instrumentos, other.instrumentos);
	}

	@Override
	public String imprimirCancion() {
		return "Numero de referencia: " + numeroReferencia + "  Titulo: " + titulo + "  Album: " + album
				+ " Intrumentos: " + instrumentos + "\n";

	}

}
