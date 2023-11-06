package ejercicios;

public class ExceptionClaseMain {

	public static void main(String[] args) {
		
		try {
			throw new ExceptionClase("Exception Ej04");
		} catch (ExceptionClase e) {
			System.out.println(e);
		}
		
	}
	
}
