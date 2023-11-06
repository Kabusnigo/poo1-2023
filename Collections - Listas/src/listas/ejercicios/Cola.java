package listas.ejercicios;

import java.util.NoSuchElementException;
import java.util.Stack;

public class Cola implements QueueInterface<T> {

	/** 6
	 * Cree una clase Cola que utilice dos pilas para contener los datos de la
	 * siguiente manera: cada vez que se encola un elemento se lo guarda en la pila
	 * A, y cada vez que se desencola una elemento se lo extrae del tope de la pila
	 * B, si la pila B está vacía entonces se desapilan todos los elementos de la
	 * pila A y se los apila en B. La clase pedida debe implementar la interfaz
	 * vista en clase:
	 * public interface QueueInterface<T> { 
	 * 
	 * public boolean isEmpty(); 
	 * public void enqueue(T newItem); 
	 * public T dequeue() throws java.util.NoSuchElementException; 
	 * public T peek() throws java.util.NoSuchElementException; 
	 * }
	 */
	
	private Stack<Character> pilaA;
	private Stack<Character> pilaB;
	
	public Cola(String pilaA) {
		this.pilaA = new Stack<Character>();
		this.pilaB = new Stack<Character>();
		
	}
	
	public void name() {
		
	}

	@Override
	public boolean isEmpty() {
		return pilaA.empty();
	}

	@Override
	public void enqueue(T newItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T dequeue() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
