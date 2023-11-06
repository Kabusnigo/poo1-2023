package juego;

import java.lang.Math;

public class Punto {
	
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean estaSobreY() {
		return x == 0;
	}

	public boolean estaSobreX() {
		return y == 0;
	}

	public boolean esElOrigen() {
		return estaSobreX() && estaSobreY();
	}

	public boolean estaSobreAlgunEje() {
		return estaSobreX() || estaSobreY();
	}
	
	public double distanciaAlOrigen() {
		//return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distancia(new Punto());
	}
	
	public double distancia(Punto o) {
		return Math.sqrt(Math.pow(o.x - this.x, 2) + Math.pow(o.y - this.y,2));
	}
	
	public void desplazar(double enX, double enY) {
		this.x += enX;
		this.y += enY;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	
	
}
