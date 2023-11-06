package pandolfo.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public static void main(String[] args) {

		File file = new File("./io/Personitas.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null)
				System.out.println(linea);

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

	}

}
