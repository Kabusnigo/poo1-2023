package simulacro_parcial1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BancoTest {

	@Test
	void ingresarDineroTest() {
		CuentaDeAhorro ca = new CuentaDeAhorro(4315126);
		CuentaCorriente cc = new CuentaCorriente(50, 45444152);
		
		ca.ingresarDinero(120);
		cc.ingresarDinero(200);
		
		assertEquals(200, cc.getSaldo());
	}
	
	@Test
	void retirarDineroTest() {
		CuentaDeAhorro ca = new CuentaDeAhorro(4315126);
		CuentaCorriente cc = new CuentaCorriente(50, 45444152);
		
		ca.ingresarDinero(120);
		ca.retirarDinero(10);
		
		cc.ingresarDinero(25);
		cc.retirarDinero(25);
		
		assertEquals(0, cc.getSaldo());
		//assertThrows(Error.class, () -> cc.retirarDinero(76));
	}
	
//	@Test
//	void abrirCuentaCorrienteTest() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void abrirCuentaDeAhorroTest() {
//		fail("Not yet implemented");
//	}

}
