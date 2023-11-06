package ejercicio.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void sacarSaldoSinExceptionTest() throws SaldoNegativoException {
		CuentaDeAhorro ca = new CuentaDeAhorro(10.0, "40000000");
		assertEquals(10.0, ca.getSaldo());
		ca.sacarSaldo(5.0);
		assertEquals(5.0, ca.getSaldo());
	}
	
}
