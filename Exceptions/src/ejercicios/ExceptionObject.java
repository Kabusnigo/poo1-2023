package ejercicios;

/** 2
 * Defina una referencia a un objeto e inicializela a null. Trate de invocar un
 * m�todo a trav�s de esta referencia. Ahora rodee el c�digo con una cl�usula
 * try-catch para probar la nueva excepci�n.
 * 
 */

public class ExceptionObject {

	public static void main(String[] args) {
		String st = null;
		try {
			st.charAt(1);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}