import java.util.ArrayList;


public class PrimeGenerator {

	public static Integer[] generate(int i) {
		
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		
		for (int n=2; n<=i ; n++) {
			primesList.add(n);
		}
		
		
		for (int m=0; m<primesList.size(); m++) {
			Integer num = primesList.get(m);
			for (int n=2; n*num<=i ; n++) {
				primesList.remove(new Integer(n*num));
			}
		}
		
		return primesList.toArray(new Integer[primesList.size()]);
		
	}

}
