package ejercicio.simbolos_balanceados;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Simbolos {
	
	// static, son metodos para la clase solamente
	static private Set<Character> deApertura;
	static private Map<Character, Character> parejita = new HashMap<Character, Character>();

	public Simbolos() {
		deApertura = new HashSet<Character>(Arrays.asList('{','[','('));
		parejita.put('}', '{');
		parejita.put(']', '[');
		parejita.put(')', '(');
	}

	public boolean estaBalanceado(String simbolos) {
		Stack<Character> pila = new Stack<Character>();
		int i = 0;
		boolean balanceado = true;
		
		while (i < simbolos.length() && balanceado) {
			if (esDeApertura(simbolos.charAt(i)))  // apertura
				pila.push(simbolos.charAt(i));
			else { // es de cierre
				if (!esLaParejita(pila.pop(), simbolos.charAt(i)))
					balanceado = false;
			}
			i++;
		}
		
		return balanceado && pila.empty();
	}
	
	public boolean esDeApertura(Character c) {
		return deApertura.contains(c); 
	}
										// [				]
	public boolean esLaParejita(Character abre, Character cierra) {
		return parejita.get(cierra).equals(abre);
	}
	
}
