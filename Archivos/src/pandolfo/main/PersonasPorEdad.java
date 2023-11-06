package pandolfo.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PersonasPorEdad {

	public static void main(String[] args) {
		
		
		File file = new File("./io/RENAPER.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;
		String[] lineaSpliteada = null;
		HashMap<Integer, List<String>> mapa = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			mapa = new HashMap<Integer, List<String>>();
			while ((linea = br.readLine()) != null) {
				lineaSpliteada = linea.split(",");
				int edad = Integer.parseInt(lineaSpliteada[1]);
				
				if (mapa.containsKey(edad)) {
					mapa.get(edad).add(" " + lineaSpliteada[0]);
				} else {
					List<String> list = new LinkedList<String>();
					list.add(lineaSpliteada[0]);
					mapa.put(edad, list);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}
		for (Integer clave : mapa.keySet()) {
			List<String> valor = mapa.get(clave);
			System.out.print(clave + " : [");
			
			for (String val : valor) 
				System.out.print(val);
			
			System.out.println("]");
		}

	}

}
