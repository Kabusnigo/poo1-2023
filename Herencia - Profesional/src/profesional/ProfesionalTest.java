package profesional;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ProfesionalTest {

	@Test
	void medicoTest() {
		Profesional chapatin = new Medico("Ronualdo", "Chapatin");
		assertEquals(500000.00, chapatin.getHonorario());
	}
	
	@Test
	void cirujanoTest() {
		Profesional chapatin = new Cirujano("Ronualdo", "Chapatin");
		assertEquals(625000.00, chapatin.getHonorario());
	}
	
	@Test
	void cirujanoCardiovascularTest() {
		Profesional chapatin = new CirujanoCardiovascular("Ronualdo", "Chapatin");
		assertEquals(781250.00, chapatin.getHonorario());
	}
	
	@Test
	void dentistaTest() {
		Profesional chapatin = new Dentista("Ronualdo", "Chapatin");
		assertEquals(500000.00, chapatin.getHonorario());
	}
	
	@Test
	void endodoncistaTest() {
		Profesional chapatin = new Endodoncista("Ronualdo", "Chapatin");
		assertEquals(625000.00, chapatin.getHonorario());
	}
	
	@Test
	void calcularMontoTotalTest() {
		ArrayList<Profesional> profesionales = new ArrayList<Profesional>();
		
		Profesional molar = new Dentista("Ronualdo", "Chapatin");
		Profesional chapatin= new Medico("Ronualdo", "Chapatin");
		
		profesionales.add(molar);
		profesionales.add(chapatin);
		
		double montoTotal = 0.0;
		
		for (Profesional profesional : profesionales) {
			montoTotal += profesional.getHonorario();
		}
		
		assertEquals(1000000, montoTotal);
	}

}
