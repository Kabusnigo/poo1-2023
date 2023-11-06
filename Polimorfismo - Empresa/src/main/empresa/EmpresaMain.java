package main.empresa;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaMain {

	public static void main(String[] args) {
		ArrayList<Servicio> servicios = new ArrayList<>();
		
		servicios.add(new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 170, 325));
		servicios.add(new TrabajoPintura("Luigi", LocalDate.parse("2023-09-18"), "Nintendo", 200, 225));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-08-30"), "Shelby Industries", 15));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-09-13"), "Comodor", 8));
		servicios.add(new TrabajoPintura("Mateo Sosa", LocalDate.parse("2023-07-01"), "Ubun", 49, 100));

		for (Servicio servicio : servicios) {
			System.out.println(servicio.detalleServicio());
		}
		
	}
	
}
