package ejercicio.ingreso_de_valores;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

/*
 * 5 Se ingresa por teclado un conjunto de valores enteros, El ingreso de datos finalizará cuando ingrese el valor 0 (cero).
 *  Luego se ingresa otro conjunto de valores enteros y, por cada uno de estos, 
 *  se debe informar si el valor ingresado pertenece o no al primer conjunto.

   6 Utilizando la función eliminar, se pide ingresar dos conjuntos A y B para mostrar el contenido resultante C = A – B.

   7 Se ingresa por teclado un conjunto de valores que finaliza con la llegada de un 0 (cero). 
	Se pide mostrar los elementos del conjunto en orden inverso al original. Usar pila.
 */

public class Valores {
	
	private List<Integer> conjuntoA;
	private List<Integer> conjuntoB;

	public Valores() {
		this.conjuntoA = new ArrayList<Integer>();
		this.conjuntoB = new ArrayList<Integer>();
	}
	
	public List<Integer> getConjuntoA() {
		return conjuntoA;
	}

	public List<Integer> getConjuntoB() {
		return conjuntoB;
	}

	// Ejercicio 05
	public void llenarConjuntos() {
		System.out.println(" Conjunto A");
		ingresarValores(conjuntoA);
		
		System.out.println(" Conjunto B");
		ingresarValores(conjuntoB);
	}
	
	private void ingresarValores(List<Integer> conjunto) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Ingrese valor: ");
		Integer valor = read.nextInt();
		
		while (valor != 0) {
			conjunto.add(valor);
			if (this.conjuntoB.size() != 0)
				estaEnConjuntoA(valor);
			
			System.out.print("Ingrese valor: ");
			valor = read.nextInt();
		}
	}
	
	private void estaEnConjuntoA(Integer valor) {
		if (this.conjuntoA.contains(valor))
			System.out.println("El valor pertenece al conjunto A");
		else
			System.out.println("El valor NO pertenece al conjunto A");
	}
	
	// Ejercicio 06
	public int eliminarConjuntoAyB() {
		return sumatoriaDelConjunto(this.conjuntoA) - sumatoriaDelConjunto(this.conjuntoB);
	}
	
	private int sumatoriaDelConjunto(List<Integer> conjunto) {
		ListIterator<Integer> itr = conjunto.listIterator();
		int sumatoria = 0;
		
		while (itr.hasNext()) {
			sumatoria += itr.next();
			itr.remove();
		}
			
		return sumatoria;
	}
	
	// Ejercicio 07
	public Stack<Integer> invertirConjunto(List<Integer> conjunto) {
		Stack<Integer> pila = new Stack<Integer>();
		
		for (int i = conjunto.size() - 1; i >= 0; i--)
			pila.push(conjunto.get(i));
		
		return pila;
	}
	
}
