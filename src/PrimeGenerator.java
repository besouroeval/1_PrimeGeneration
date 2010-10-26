import java.util.ArrayList;


public class PrimeGenerator {

	public static Integer[] generate(int i) {
		
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		
		for (int n=2; n<=i ; n++) {
			primesList.add(n);
		}
		
		primesList.remove(new Integer(2*2));
		primesList.remove(new Integer(4*2));
		primesList.remove(new Integer(2*3));
		
		return primesList.toArray(new Integer[primesList.size()]);
		
	}

}
