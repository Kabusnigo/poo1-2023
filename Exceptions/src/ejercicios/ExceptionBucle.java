package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Defina un comportamiento de tipo reanudaci�n utilizando un bucle while que se
 * repita hasta que se deje de generar una excepci�n.
 * 
 */

public class ExceptionBucle {

	public static void main(String[] args) {
		Boolean continuar = Boolean.TRUE;
		
		while (continuar) {
			try {
				System.out.print("Introduce numero: ");
				Scanner read = new Scanner(System.in);
				Integer numero = read.nextInt();
				read.close();
				System.out.println(numero);
				continuar = Boolean.FALSE;
			} catch (InputMismatchException e) {
				System.out.println(e);
			}
		}
		
	}

}