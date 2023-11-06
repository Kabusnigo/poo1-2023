package pandolfo.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {

	public static void main(String[] args) {

		File file = new File("./io/Personitas.txt");
		BufferedWriter bw = null;

		try {
			FileWriter fw = new FileWriter(file, true); // append, lo que estaba
			//Osea, agrego informacion al archivo sin reemplazarlo.
			bw = new BufferedWriter(fw);
			bw.write("mateo"); // Si se sucede la exception aca! se saltea el close
			bw.newLine();
			bw.write("natasha");
			bw.newLine();
			bw.write("nayla");
			bw.newLine();
			// bw.close() // NO es conveniente hacer el cierre aca, porq puede quedar
			// abierto si sucede una exception en la linea 17
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	}

}
