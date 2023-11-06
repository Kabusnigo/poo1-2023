package ejercicios;

/** 1
 * Cree una clase con un m�todo main() que genere un objeto de la clase
 * Exception dentro de un bloque try. Proporcione al constructor de Exception un
 * argumento String. Capture la excepci�n dentro de una cl�usula catch e imprima
 * el argumento String. A�ada una cl�usula finally e imprima un mensaje para
 * demostrar que pas� por all�.
 * 
 */

public class ExceptionString extends Exception {
	
	public ExceptionString(String mensaje) {
		super(mensaje);
	}

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("Una excepción de POO1");
			throw e;
			
//			throw new Exception("ups");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("\n Pasé por el finally.");
		}
		
	}
	
}

