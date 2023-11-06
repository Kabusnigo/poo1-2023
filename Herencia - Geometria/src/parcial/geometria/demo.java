package parcial.geometria;

public class demo {

	public static void main (String[] args) {
	
		Figura cua = new Cuadrado(2);
		Figura rec = new Rectangulo(2,3);
		Figura tri = new Triangulo(2,3);
		
		Figura[] figuras = {cua, rec, tri};
		
		Figura[] figus = new Figura[3];
		
		figus[0] = new Cuadrado(3);
		
		double total = 0;
		
		for (int i = 0; i < figuras.length; i++) {
			total += figuras[i].getArea();
		}
		
		System.out.println("Suma de todas las áreas es: " + total);
		
	}
	
}
