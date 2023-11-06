package ejercicios;

/**
 * 3 Escriba c�digo para generar y capturar una excepci�n
 * ArrayIndexOutOfBoundsException (�ndice de matriz fuera de l�mites).
 *
 */

public class ExceptionArray {

	public static void main(String[] args) {

//		List<Integer> lista = new ArrayList<Integer>();
		int arreglo[] = new int[1];
		try {
			arreglo[1] = 23;
//			lista.get(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}