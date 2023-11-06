package pandolfo.main;

import java.io.File;
import java.io.FilenameFilter;

public class MiFiltro implements FilenameFilter {

	private String prefix;
	
	
	
	public MiFiltro(String prefix) {
		if (prefix == null) {
			throw new IllegalArgumentException("El prefijo del Filtro no puede ser null");
		}
		this.prefix = prefix;
	}



	@Override
	public boolean accept(File dir, String name) {
		return name.startsWith(prefix);
	}

}
