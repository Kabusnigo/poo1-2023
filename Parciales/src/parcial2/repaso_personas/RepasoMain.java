package parcial2.repaso_personas;

public class RepasoMain {
	
	public static void main(String[] args) {
		Repaso repaso = new Repaso();
		
		try {
			repaso.readFile("repaso_datos_personas.txt");
		} catch (ReadingException e) {
			e.printStackTrace();
		}
		
		repaso.mostrarDatos();
	}
	
	
}
