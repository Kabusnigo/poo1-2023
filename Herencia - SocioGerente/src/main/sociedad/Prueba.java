package main.sociedad;

import java.util.ArrayList;

public class Prueba { 
	public static void main(String[] args) {
		
		SocioHecho socioHecho1 = new SocioHecho("pepe", 20.0);
		SocioHecho socioHecho2 = new SocioHecho("pepa", 80.0);

		ArrayList<SocioHecho> socios= new ArrayList<SocioHecho>() ;
		socios.add(socioHecho1);
		socios.add(socioHecho2);
		
		SociedadHecho sociedadHecho1 = new SociedadHecho("pepsi", "Vicente Lopez 106" , 1000.0, 30528184866l, socios);
		
		SocioGerente socioGerente1 = new SocioGerente("Steve Jobs", 300000.0);
		SocioGerente socioGerente2 = new SocioGerente("Bill Gates", 1000000.0);
		
		ArrayList<SocioGerente> sociosGerentes= new ArrayList<SocioGerente>() ;
		
		SociedadResposabiliadLimitada sociedadResposabiliadLimitada1 = new SociedadResposabiliadLimitada("pepsi", "Vicente Lopez 106" , 1000.0, 30528184866l, sociosGerentes, 10);
		
		
		
		ImprimidorDeSociedades imprimidorDeSociedades = new ImprimidorDeSociedades();
		
		ArrayList<Sociedad> sociedades = new ArrayList<Sociedad>();
		
		sociedades.add(sociedadHecho1);
		sociedades.add(sociedadResposabiliadLimitada1);
		
		imprimidorDeSociedades.imprimirSociedades(sociedades);
		
	}

}
