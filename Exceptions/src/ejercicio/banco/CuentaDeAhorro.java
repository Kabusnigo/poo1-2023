package ejercicio.banco;

/**
 * 4-Si el saldo de CuentaDeAhorro fuese a quedar negativo, antes de debe lanzar
 * una excepción SaldoNegativo (que hereda de Exception).
 * @author Alumnos
 *
 */

public class CuentaDeAhorro extends Cuenta {

	public CuentaDeAhorro(Double saldo, String dni) {
		super(saldo, dni);

	}

	@Override
	public Double sacarSaldo(Double saldoARetirar) throws SaldoNegativoException{
		Double saldo = super.getSaldo();
		if (saldoARetirar > saldo)
			throw new SaldoNegativoException(saldoARetirar, saldo);
			
		super.setSaldo(saldo - saldoARetirar);
		return saldoARetirar;
	}

	@Override
	public String toString() {
		return "CuentaDeAhorro []" + super.toString();
	}

	
	
}
