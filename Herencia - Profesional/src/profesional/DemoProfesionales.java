package profesional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoProfesionales {

	public static void main(String[] args) {

		// PARA ORDENAR NECESITO IMPLEMENTAR EN LA CLASE "Profesional", implements
		// Comparable<Profesional>
		// Y en su clase implementar el metodo .compare

		// Vector de Objectos. Uso "Arrays.sort(Object[]); para ordernar

		Profesional molar = new Dentista("Ronualdo", "Chapatin");
		Profesional chapatin = new Medico("Profundo", "Rona");
		Profesional mateo = new CirujanoCardiovascular("Mateo", "Sosa");
		Profesional venonat = new Cirujano("Sangriento", "Venoso");

		Profesional[] profesionales = { molar, chapatin, mateo, venonat };

		Arrays.sort(profesionales);

		for (Profesional profesional : profesionales) {
			System.out.println(profesional);
		}

		ArrayList<Profesional> listaProfesionales = new ArrayList<Profesional>();

		listaProfesionales.add(molar);
		listaProfesionales.add(chapatin);
		listaProfesionales.add(mateo);
		listaProfesionales.add(venonat);

		Collections.sort(listaProfesionales);

		for (Profesional profesional : profesionales) {
			System.out.println(profesional);
		}

	}

}
