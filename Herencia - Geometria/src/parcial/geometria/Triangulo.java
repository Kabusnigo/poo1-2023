package parcial.geometria;

public class Triangulo extends Figura {

	public Triangulo(double b, double a) {
		super((b * a) / 2);
	}
	
	
	//NO PUEDO SOBREESCRIBIR UN METODO FINAL!!
//	@Override
//	public double getArea() {
//		return super.getArea();
//	}

}
