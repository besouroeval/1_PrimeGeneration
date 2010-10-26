import junit.framework.Assert;

import org.junit.Test;


public class PrimeGenerationTest {

	@Test
	public void shouldGenerateUpTo1() {
		
		int[] primes = PrimeGenerator.generate(1);
		Assert.assertEquals(0, primes.length);
		
	}
	
}
