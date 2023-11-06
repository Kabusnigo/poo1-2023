package pandolfo.main;

public class UsoRENAPER {

	public static void main(String[] args) {
		
		RENAPER renaper = new RENAPER();
		
		renaper.agregarPersona(new Persona("Pablo", 38));
		renaper.agregarPersona(new Persona("Mateo", 26));
		renaper.agregarPersona(new Persona("Franco", 26));
		renaper.agregarPersona(new Persona("Franco", 19));
		renaper.agregarPersona(new Persona("Alexis", 21));
		
		renaper.guardarArchivo("RENAPER.txt");
	}
	
}
