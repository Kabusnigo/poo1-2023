package parcial2.elparcial;

import java.util.Collections;
import java.util.List;

public class Listas<T extends Comparable<T>> {
	public boolean todosSonMenores(List<T> l1, List<T> l2) {
		Collections.sort(l1);
		Collections.sort(l2);
		
		if (l1.get(l1.size() - 1).compareTo(l2.get(l2.size() - 1)) == -1)
			return true;
		else
			return false;
//		return l1.get(l1.size() - 1).compareTo(l2.get(l2.size() - 1)) < 0;
	}
	/** ALTERNATIVA
	 * public boolean todosSonMenores(List<T> l1, List<T> l2) {
    for (T elem1 : l1) {
        for (T elem2 : l2) {
            if (elem1.compareTo(elem2) >= 0) {
                return false;
            }
        }
    }
    return true;
}
	 */
}
