package ejercicio.banco;

import java.util.List;

/**
 * Un banco contiene las Cuentas de sus clientes. Las cuentas de ahorro no
 * pueden tener n�meros rojos. Las cuentas corrientes pueden tener una cuenta de
 * ahorro asociada, de forma que si se intenta retirar m�s dinero del saldo
 * actual, se debe retirar el dinero que falte de la cuenta de ahorro asociada.
 * 
 * 1-Define Cuenta de forma que no pueda instanciarse. De toda Cuenta se debe
 * poder ingresar y retirar dinero, preguntar por el saldo, por el DNI del
 * titular y debe tener un m�todo toString de devuelva al menos el saldo y el
 * DNI del titular.
 *
 * 2-Implementa las clases CuentaCorriente y CuentaDeAhorro.
 *
 * 3-Crea una especializaci�n CuentaDeAhorroEsp de CuentaDeAhorro en la que se
 * a�ade un entero penalizaci�n, de forma que se penaliza la retirada con una
 * penalizaci�n % del dinero retirado. Sobrescribe s�lo los m�todos necesarios
 * (incluyendo constructor y toString).
 * 
 * 4-Si el saldo de CuentaDeAhorro fuese a quedar negativo, antes de debe lanzar
 * una excepci�n SaldoNegativo (que hereda de Exception).
 * 
 * 5-Implementa la clase Banco que contiene una colecci�n de Cuentas, incluyendo
 * el constructor que consideres m�s apropiado.
 * 
 * 6-Incluye el m�todo totalSaldoMaxPenalizaci�n en la clase Banco que devuelva
 * la suma de los saldos de todas las cuentas corrientes y la m�xima
 * penalizaci�n entre las CuentaDeAhorroEsp.
 * 
 * 7-Crea una clase con m�todo main en la que instanciamos un Banco de 100
 * Cuentas, nos creamos una CuentaCorriente con 5000 pesos y una cuenta de
 * ahorro especial con una penalizaci�n del 5%. Finalmente debe mostrar
 * informaci�n de todas las Cuentas del Banco. En un bloque try & catch retirar
 * dinero de una Cuenta de Ahorro.
 * 
 */

public class Banco {

	private List<Cuenta> cuentas;

	public Banco(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	/**
	 * * 3-Crea una especializaci�n CuentaDeAhorroEsp de CuentaDeAhorro en la que se
	 * a�ade un entero penalizaci�n, de forma que se penaliza la retirada con una
	 * penalizaci�n % del dinero retirado. Sobrescribe s�lo los m�todos necesarios
	 * (incluyendo constructor y toString).
	 * 
	 */
	
	public double totalSaldo() {
		double totalSaldo = 0.0;
		
		for (Cuenta cuenta : cuentas)
			totalSaldo += cuenta.getSaldo();
		
		return totalSaldo;
	}

}
