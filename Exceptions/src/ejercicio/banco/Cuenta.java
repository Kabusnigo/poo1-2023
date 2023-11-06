package ejercicio.banco;

public abstract class Cuenta {

	private Double saldo;
	private String dni;
	
	public Cuenta(Double saldo, String dni) {
		this.saldo = saldo;
		this.dni = dni;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void ingresarSaldo(Double saldo) {
		this.saldo += saldo;
	}
	
	public abstract Double sacarSaldo(Double saldo) throws SaldoNegativoException;

	public String getDni() {
		return dni;
	}
	
	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", dni=" + dni + "]";
	}
	
	
}
