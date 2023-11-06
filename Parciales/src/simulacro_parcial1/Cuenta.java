package simulacro_parcial1;

import java.util.Objects;

public abstract class Cuenta implements Comparable<Cuenta> {

	protected double saldo;
	protected int dni;
	
	public Cuenta(int dni) {
		this.saldo = 0;
		this.dni = dni;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public abstract void ingresarDinero(double dinero);
	
	public abstract void retirarDinero(double dineroARetirar);
	
	public abstract void transferirDinero(Cuenta destino, double importe);
	
	@Override
	public String toString() {
		return "Saldo: " + saldo + ",\t DNI: " + dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return dni == other.dni && Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
	
	@Override
	public int compareTo(Cuenta o) {
		return Double.compare(saldo, o.saldo);
	}
	
}
