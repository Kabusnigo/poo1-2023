package ejercicios;

/**
 * Cree su propia clase de excepci�n utilizando la palabra clave extends.
 * Escriba un constructor para dicha clase que tome un argumento String y lo
 * almacene dentro del objeto como una referencia de tipo String. Escriba un
 * m�todo que muestre la cadena de caracteres almacenada. Cree una cl�usula
 * try-catch para probar la nueva excepci�n.
 * 
 */

public class ExceptionClase extends Exception{
	
//	private static final long serialVersionUID = 1L;
	
	public ExceptionClase(String mensaje) {
		super(mensaje);
	}
	
}