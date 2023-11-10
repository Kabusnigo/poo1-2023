package ejercicio;

import java.util.Stack;

public class Teletipo {

	/**
	 * En una terminal de teletipo existe un car�cter de retroceso que permite
	 * cancelar el �ltimo car�cter. Por ejemplo: si el car�cter de retroceso es /,
	 * entonces la l�nea abc/d//e ser� interpretada como ae. Existe tambi�n un
	 * car�cter anulador que elimina todos los caracteres ingresados hasta el
	 * momento, suponga que ese car�cter es &. Realice un m�todo que dada una tira
	 * de caracteres terminadas con * (le�da del archivo �Fuente.txt�) ejecute las
	 * operaciones indicadas si se encuentra con el car�cter / o el &. Debe por
	 * �ltimo imprimir la tira resultante.
	 */

	private Stack<Character> pila;

	public Teletipo(String caracteres) {
		pila = new Stack<Character>();
		for (int i = 0; i < caracteres.length(); i++)
			pila.push(caracteres.charAt(i));
	}

	public Stack<Character> getPila() {
		return pila;
	}

	public Stack<Character> invertirPila() {
		Stack<Character> pilaInvertida = new Stack<Character>();

		while (!pila.empty()) {
			pilaInvertida.push(pila.peek()); // Colocamos desde la E
			pila.pop();
		}

		return pilaInvertida;
	}

	public String procesar() {
		pila = invertirPila();
		
		Stack<Character> tmp = new Stack<Character>();
		
		while (!pila.isEmpty()) {
			Character character = pila.pop();
			switch (character) {
			case '/':
				if (!tmp.isEmpty())
					tmp.pop();
				break;
			case '&':
				while (!tmp.empty())
					tmp.pop();
				pila.pop();
				break;
			default:
				tmp.push(character);
			}
		}
		

//			case '&':
//				while (!tmp.empty())
//					tmp.pop();
//				pila.pop();
//				break;
		
		pila = tmp;
		pila = invertirPila();
		String cadenaResultado = "";

		while (!pila.empty()) 
			cadenaResultado += pila.pop();
		
		return cadenaResultado;
	}

	public static void main(String[] args) {
//		Stack<Character> pila = new Stack<Character>();

		Teletipo teletipo = new Teletipo("abc/d//e");
		
//		System.out.println(teletipo.getPila());
//		System.out.println(teletipo.invertirPila());
		System.out.println(teletipo.procesar());

//		char[] caracteres = palabra.toCharArray();
//
//		for (int i = 0; i < caracteres.length; i++)
//			pila.push(caracteres[i]);
//
//		System.out.println(pila + "\n");
//
//		for (int i = 0; i < pila.size(); i++) {
//			if (pila.get(i) == '/') {
//				pila.pop();
//			}
//		}
//
//		System.out.println(pila);

	}
}
