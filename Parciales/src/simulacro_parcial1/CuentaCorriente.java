package simulacro_parcial1;

public class CuentaCorriente extends Cuenta {

	private double descubierto;
	
	public CuentaCorriente(double descubierto, int dni) {
		super(dni);
		this.descubierto = descubierto;
	}

	@Override
	public void ingresarDinero(double dinero) {
		saldo += dinero;
	}

	@Override
	public void retirarDinero(double dineroARetirar) {
		if (dineroARetirar > super.getSaldo() + descubierto) {
			throw new Error("No quedó saldo.");
		}
		saldo -= dineroARetirar;
	}

	@Override
	public void transferirDinero(Cuenta destino, double importe) {
		this.retirarDinero(importe);
		destino.ingresarDinero(this.getSaldo());
	}

	
	
}
