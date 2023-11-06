package ejercicio.palabra;

import java.util.Stack;

public class Palabra {
	
	public String invertirPalabra(String palabra) {
		Stack<Character> pila = new Stack<Character>();
		Stack<Character> pila2 = new Stack<Character>();
		
		// Llenar pila con "for"
		for (int i = 0; i < palabra.length(); i++)
			pila.push(palabra.charAt(i));

		// Llenar pila con "forEach"
		for (Character character : palabra.toCharArray())
			pila2.push(character);
		
		String palabraInvertida = "";
		
		while (!pila2.empty())
			palabraInvertida += pila2.pop();
		
		return palabraInvertida;
	}
	
	public boolean esPalindromo(String palabra) {
		return palabra.equalsIgnoreCase(invertirPalabra(palabra));
	}

	// MAIN
	public static void main(String[] args) {
		Palabra palabra = new Palabra();
		String resultado = palabra.invertirPalabra("Rocky");
		System.out.println(resultado);
		
	}
	
}
