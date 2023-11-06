package parcial2.infractores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Infractores {

	private Map<String, Integer> infractores = new HashMap<String, Integer>();

	public void leerInfractores(String entrada) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(entrada);
			br = new BufferedReader(fr);
			String linea;
			Integer multa = 50000;

			while ((linea = br.readLine()) != null) {
				String[] datos = linea.split(" ");
				String patente = datos[0];
				int velocidad = Integer.parseInt(datos[1]);

				if (velocidad > 80) {
					if (infractores.containsKey(patente))
						infractores.put(patente, infractores.get(patente) + multa);
					else
						infractores.put(patente, multa);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	public void escribirMultados(String salida) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter(salida);
			pw = new PrintWriter(fw);
			for (Map.Entry<String, Integer> entry : infractores.entrySet()) {
				String key = entry.getKey();
				Integer val = entry.getValue();
				pw.println(key + " " + val);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null)
				pw.close();
		}
	}
	
	public List<Integer> diferencia(List<Integer> l1, List<Integer> l2){
		List<Integer> l3 = new LinkedList<>();
		
		l3.addAll(l1);
		l3.removeAll(l2);
		
		return l3;
	}

	public static void main(String[] args) {

		Infractores infractores = new Infractores();

		infractores.leerInfractores("infractores.in");
		infractores.escribirMultados("multados.out");
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 8, 9, 10));
		
		System.out.println(infractores.diferencia(l1, l2));
	}

}
