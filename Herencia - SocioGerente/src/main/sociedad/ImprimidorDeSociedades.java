package main.sociedad;

import java.util.ArrayList;

public class ImprimidorDeSociedades {

	
	public void imprimirSociedad(Sociedad sociedad) {
		sociedad.imprimirInformacionDisponible();
	}
	
	public void imprimirSociedades(ArrayList<Sociedad> sociedades) {
		for (Sociedad sociedad : sociedades) {
			sociedad.imprimirInformacionDisponible();
			
		}
	}
	
}
