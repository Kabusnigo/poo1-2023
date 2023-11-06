package ejercicio.colasen1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

class SumaDeColasTest {

	@Test
	void dosColasEnUnaTest() {
		SumaDeColas d = new SumaDeColas();
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		Queue<Integer> esp = new LinkedList<Integer>();
		q1.addAll(Arrays.asList(1,2,3));
		q2.addAll(Arrays.asList(5,7));
		esp.addAll(Arrays.asList(1,2,3,5,7));
		assertEquals(esp,d.dosColasEnUna(q1, q2));
	}
	
}
