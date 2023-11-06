package io_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerEntero {

	public static void main(String[] arg) {
		int suma = 0;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// DEBEN estar adentro de un bloque TRY
			fr = new FileReader("./io/enteros.txt");
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {
				try {
					suma += Integer.parseInt(linea);
				} catch (NumberFormatException e) {
					System.err.println("Uno de los datos le�dos no es un entero");
				}
			}
			System.out.println("Suma = " + suma);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Suma = " + suma);
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
