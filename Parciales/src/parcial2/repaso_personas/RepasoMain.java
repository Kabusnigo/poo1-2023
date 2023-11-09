package parcial2.repaso_personas;

public class RepasoMain {
	
	public static void main(String[] args) {
		Repaso repaso = new Repaso();
		
		try {
			repaso.readFile("repaso_datos_personas.txt");
		} catch (ReadingException e) {
			e.printStackTrace();
		}
		
		try {
			repaso.writeFile("repaso_datos_personas_SALIDA.txt");
		} catch(ReadingException e) {
			e.printStackTrace();
		}
		
		repaso.getListaEdad();
		System.out.println("\n Nombres por letra:");
		repaso.nombresConLaLetra('A');
		
		System.out.println("\n Apellidos por letra:");
		repaso.apellidoConLaLetra('M');
	}
	
	
}
