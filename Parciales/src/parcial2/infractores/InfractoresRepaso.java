package parcial2.infractores;

import java.io.BufferedReader;
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

public class InfractoresRepaso<T> {

	private Map<String, Integer> infractores = new HashMap<String, Integer>();

	// Este si maneja a la Exception y la imprime
	public void leerInfractores(String entrada) {
		FileReader fr = null;
		BufferedReader br = null;
		String linea;
		String[] datos;
		int multa = 50000;

		try {
			fr = new FileReader(entrada);
			br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {
				datos = linea.split(" ");
				String patente = datos[0];
				Integer velocidad = Integer.parseInt(datos[1]);

				if (velocidad > 80) {
					if (infractores.containsKey(patente)) {
//						infractores.replace(patente, infractores.get(patente), infractores.get(patente) + multa);
						infractores.put(patente, infractores.get(patente) + multa);
					} else
						infractores.put(patente, multa);
				}

			}
		} catch (IOException e) {
//			throw new IOException();
			e.printStackTrace();
		} catch (Exception e) {
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

	// Este no maneja a la Exception, se la pasa al Main
	public void escribirMultados(String salida) throws IOException {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter(salida);
			pw = new PrintWriter(fw);

			for (Map.Entry<String, Integer> entry : infractores.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();

				pw.println(key + " " + value);
			}
		} catch (IOException e) {
			throw new IOException();
		}

		pw.close();
	}
	
	public List<T> diferencia(List<T> l1, List<T> l2){
		List<T> l3 = new ArrayList<>();
		List<T> tienenEnComun = new ArrayList<>();
		
		// Esta es la idea de lo que pasará
		// l1 = 1, 3, 5, 6, 8, 9, 10
		// l2 = 2, 4, 7, 8, 9, 10
		// tienenEnComun = 8, 9, 10
		
		// l3 = 1, 3, 5, 6, 8, 9, 10, 2, 4, 7, 8, 9, 10
		l3.addAll(l1);
		l3.addAll(l2);
		
		// tienenEnComun = 1, 3, 5, 6, 8, 9, 10
		tienenEnComun.addAll(l1);
		// tienenEnComun = 8, 9, 10
		tienenEnComun.retainAll(l2);
		
		// l3 = 1, 3, 5, 6, 2, 4, 7
		l3.removeAll(tienenEnComun);
		
		
		// CON ForEAch
//		List<Integer> diferenciaSimetrica = new LinkedList<Integer>();
//		// recorro l1
//		for (Integer cadaElementoEnL1 : l1) {
//			if (!l2.contains(cadaElementoEnL1))
//				diferenciaSimetrica.add(cadaElementoEnL1);
//		}
//		// recorro l2
//		for (Integer cadaElementoEnL2 : l2) {
//			if (!l1.contains(cadaElementoEnL2))
//				diferenciaSimetrica.add(cadaElementoEnL2);
//		}
		
		return l3;
	}
	
	public static void main(String[] args) throws IOException {
		InfractoresRepaso ir = new InfractoresRepaso();

		ir.leerInfractores("infractores.in");
		ir.escribirMultados("multados.txt");
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 8, 9, 10));
		
		System.out.println(ir.diferencia(l1, l2));
	}

}
