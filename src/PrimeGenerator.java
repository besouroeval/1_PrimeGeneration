import java.util.ArrayList;


public class PrimeGenerator {

	public static Integer[] generate(int i) {
		
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		
		if (i>1)
			primesList.add(2);
		
		return primesList.toArray(new Integer[primesList.size()]);
		
	}

}
