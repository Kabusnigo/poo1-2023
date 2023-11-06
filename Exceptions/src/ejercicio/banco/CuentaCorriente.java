package ejercicio.banco;

public class CuentaCorriente extends Cuenta {

	private CuentaDeAhorro cuentaAsociada;

	public CuentaCorriente(Double saldo, String dni, CuentaDeAhorro cuentaAsociada) {
		super(saldo, dni);
		this.cuentaAsociada = cuentaAsociada;
	}

	@Override
	public Double sacarSaldo(Double saldoARetirar) throws SaldoNegativoException {
		Double saldo = super.getSaldo();
		if (saldoARetirar > saldo) {
			double saldoARetirarCuentaAsociada = saldoARetirar -= saldo;
			this.cuentaAsociada.sacarSaldo(saldoARetirarCuentaAsociada);
			super.setSaldo(0.0);
			return saldoARetirar;
		}
		super.setSaldo(saldo - saldoARetirar);
		return saldoARetirar;
	}

}
