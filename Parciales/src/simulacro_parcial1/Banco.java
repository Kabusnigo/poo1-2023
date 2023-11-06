package simulacro_parcial1;

import java.util.ArrayList;
import java.util.Collections;

public class Banco {

	private ArrayList<Cuenta> cuentas;

	public Banco() {
		cuentas = new ArrayList<Cuenta>();
	}

	public Cuenta abrirCuentaCorriente(int dni, double descubierto) {
		Cuenta cuenta = new CuentaCorriente(descubierto, dni);
		cuentas.add(cuenta);
		return cuenta;
	}

	public Cuenta abrirCajaDeAhorro(int dni) {
		Cuenta cuenta = new CuentaDeAhorro(dni);
		cuentas.add(cuenta);
		return cuenta;
	}

	// devuelve la suma de los saldos de todas las cuentas corrientes que están en
	// descubierto,
	public double totalSaldoEnDescubierto() {
		double total = 0;
		for (Cuenta cuenta : cuentas) {
			if (cuenta.getSaldo() < 0) {
				total += cuenta.getSaldo();
			}
		}
		return Math.abs(total);
	}

	// que muestra los datos de todas las cuentas del banco, ordenado por saldo de
	// manera ascendente.
	public void listarCuentas() {
		Collections.sort(cuentas);
		System.out.println("DNI " + "\t" + "Saldo");
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta);
		}
	}

}
