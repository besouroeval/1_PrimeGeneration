import java.util.ArrayList;


public class PrimeGenerator {

	public static Integer[] generate(int i) {
		
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		
		for (int n=2; n<=i ; n++) {
			primesList.add(n);
		}
		
		for (int n=2; n*2<=i ; n++) {
			primesList.remove(new Integer(n*2));
		}
		for (int n=2; n*3<=i ; n++) {
			primesList.remove(new Integer(n*3));
		}
		primesList.remove(new Integer(3*3));
		primesList.remove(new Integer(5*3));
		primesList.remove(new Integer(7*3));
		
		return primesList.toArray(new Integer[primesList.size()]);
		
	}

}
