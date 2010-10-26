import java.util.ArrayList;


public class PrimeGenerator {

	public static Integer[] generate(int i) {
		
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		
		for (int n=2; n<=i ; n++) {
			primesList.add(n);
		}
		
		if (primesList.contains(4))
			primesList.remove(4);
		
		return primesList.toArray(new Integer[primesList.size()]);
		
	}

}
