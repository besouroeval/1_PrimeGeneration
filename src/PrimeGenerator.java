import java.util.ArrayList;


public class PrimeGenerator {

	public static Integer[] generate(int i) {
		
		System.out.println("up to  " + i);
		
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		
		for (int n=2; n<=i ; n++) {
			primesList.add(n);
		}
		
		
		for (int m=0; m<primesList.size(); m++) {
			Integer num = primesList.get(m);
			System.out.println("    num " + num);
			for (int n=2; n*num<i ; n++) {
				System.out.println("    removing " + n*num);
				primesList.remove(new Integer(n*num));
			}
		}
		
//		for (int n=2; n*2<=i ; n++) {
//			primesList.remove(new Integer(n*2));
//		}
//		for (int n=2; n*3<=i ; n++) {
//			primesList.remove(new Integer(n*3));
//		}
		
		return primesList.toArray(new Integer[primesList.size()]);
		
	}

}
