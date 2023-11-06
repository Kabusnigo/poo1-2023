package ejercicio.banco;

public class SaldoNegativoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoNegativoException(Double saldoARetirar, Double saldo) {
		super("Error: $"+ saldoARetirar + " el saldo a retirar excede de la cuenta $" + saldo);
	}
	
}
