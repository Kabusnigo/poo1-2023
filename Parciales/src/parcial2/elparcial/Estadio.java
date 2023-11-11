package parcial2.elparcial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Estadio {

	private Map<String, EspectadoresPorEntrada> espectadores = new HashMap<String, EspectadoresPorEntrada>();

	public void leerArchivo(String archivo) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {
				String datos[]= linea.split(",");
				Integer puerta = Integer.parseInt(datos[1]);
				Integer espectadores = Integer.parseInt(datos[2]);
				
				if (puerta >= 1 && puerta <= 15 && datos[0].length() < 10 && espectadores >= 0) {
					if (this.espectadores.containsKey(datos[0])) {
						this.espectadores.get(datos[0]).ingresarEspectadoresPorLaPuerta(puerta, espectadores);
					} else {
						this.espectadores.put(datos[0], new EspectadoresPorEntrada());
						this.espectadores.get(datos[0]).ingresarEspectadoresPorLaPuerta(puerta, espectadores);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			
			}
		}
	}
	
	public void escribirArchivo(String salida) {
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(salida);
			pw = new PrintWriter(fw);
			
			for (Map.Entry<String, EspectadoresPorEntrada> entry : espectadores.entrySet()) {
				String key = entry.getKey();
				EspectadoresPorEntrada val = entry.getValue();
				
				pw.println(key + "," + val.getCantidadDeEspectadore());
				for (int i = 1; i <= 15; i++)
					pw.println("Puerta" + i + "," + val.getEspectdoresPorPuerta(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
	
	public static void main(String[] args) {
		Estadio estadio = new Estadio();
		
		estadio.leerArchivo("evento.txt");
		estadio.escribirArchivo("espectadores.txt");
	}

}
