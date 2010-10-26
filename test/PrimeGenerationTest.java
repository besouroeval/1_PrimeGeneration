import junit.framework.Assert;

import org.junit.Test;


public class PrimeGenerationTest {

	@Test
	public void shouldGenerateUpTo1() {
		Integer[] primes = PrimeGenerator.generate(1);
		Assert.assertEquals(0, primes.length);
	}
	
	@Test
	public void shouldGenerateUpTo2() {
		Integer[] primes = PrimeGenerator.generate(2);
		Assert.assertEquals(1, primes.length);
		Assert.assertEquals(2, primes[0].intValue());
	}
	
	@Test
	public void shouldGenerateUpTo3() {
		Integer[] primes = PrimeGenerator.generate(3);
		Assert.assertEquals(2, primes.length);
		Assert.assertEquals(2, primes[0].intValue());
		Assert.assertEquals(3, primes[1].intValue());
	}
	
	@Test
	public void shouldGenerateUpTo4() {
		verifyGeneration(4, new int[]{2,3});
	}
	
	@Test
	public void shouldGenerateUpTo5() {
		verifyGeneration(5, new int[]{2,3,5});
	}
	
	@Test
	public void shouldGenerateUpTo6() {
		verifyGeneration(6, new int[]{2,3,5});
	}

	private void verifyGeneration(int i, int[] expected) {
		Integer[] primes = PrimeGenerator.generate(i);
		Assert.assertEquals(expected.length, primes.length);
		for (int n = 0 ; n<expected.length ; n++)
			Assert.assertEquals(expected[n], primes[n].intValue());
	}
	
}
