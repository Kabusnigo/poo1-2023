package simulacro_parcial1;

public class CuentaDeAhorro extends Cuenta {

	public CuentaDeAhorro(int dni) {
		super(dni);
	}

	@Override
	public void ingresarDinero(double dinero) {
		saldo += dinero;
	}

	@Override
	public void retirarDinero(double dineroRetirar) {
		if (dineroRetirar > super.getSaldo()) {
			throw new Error("\nNo quedó saldo.");
		}
		saldo -= dineroRetirar;
	}

	@Override
	public void transferirDinero(Cuenta destino, double importe) {
		this.retirarDinero(importe);
		destino.ingresarDinero(this.getSaldo());
	}
	
}
