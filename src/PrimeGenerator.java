import java.util.ArrayList;


public class PrimeGenerator {

	public static int[] generate(int i) {
		
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		
		if (i>1)
			return new int[]{2};
		
		int[] primes = new int[primesList.size()];
		return primesList.toArray(primes);
	}

}
