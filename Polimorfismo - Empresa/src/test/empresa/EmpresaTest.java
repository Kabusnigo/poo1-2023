package test.empresa;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.empresa.RevisionAlarma;
import main.empresa.Servicio;
import main.empresa.TrabajoPintura;

class EmpresaTest {

	private ArrayList<Servicio> servicios;

	public EmpresaTest() {
		servicios = new ArrayList<>();
	}

	@Test
	void costeMaterialTest() {
		servicios.add(new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 170, 325));
		servicios.add(new TrabajoPintura("Luigi", LocalDate.parse("2023-09-18"), "Nintendo", 200, 225));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-08-30"), "Shelby Industries", 15));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-09-13"), "Comodor", 8));

		Servicio tp = new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 170, 325);
		Servicio ra = (new RevisionAlarma(LocalDate.parse("2023-09-13"), "Comodor", 8));

		assertEquals(tp.costeMaterial(), servicios.get(0).costeMaterial());
	}

	@Test
	void costeManoObraTest() {
		servicios.add(new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 170, 325));
		servicios.add(new TrabajoPintura("Luigi", LocalDate.parse("2023-09-18"), "Nintendo", 200, 225));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-08-30"), "Shelby Industries", 15));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-09-13"), "Comodor", 8));

		Servicio tp = new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 170, 325);
		Servicio ra = (new RevisionAlarma(LocalDate.parse("2023-09-13"), "Comodor", 8));

		assertEquals(ra.costeManoObra(), servicios.get(3).costeManoObra());
	}

	@Test
	void costeTotalTest() {
		servicios.add(new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 170, 325));
		servicios.add(new TrabajoPintura("Luigi", LocalDate.parse("2023-09-18"), "Nintendo", 200, 225));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-08-30"), "Shelby Industries", 15));
		servicios.add(new RevisionAlarma(LocalDate.parse("2023-09-13"), "Comodor", 8));

		Servicio tp = new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 170, 325);
		Servicio ra = (new RevisionAlarma(LocalDate.parse("2023-09-13"), "Comodor", 8));

		assertEquals(200, servicios.get(2).costeTotal());
	}

	@Test
	void costeAdicionalTest() {
		servicios.add(new TrabajoPintura("Mario", LocalDate.parse("2023-09-22"), "ACME", 49, 325));
		servicios.add(new TrabajoPintura("Luigi", LocalDate.parse("2023-09-18"), "Nintendo", 200, 225));
		// SIN COSTE ADICIONAL : 2088,21
		assertEquals(2401.44, servicios.get(0).costeTotal(), 2);
	}

}
