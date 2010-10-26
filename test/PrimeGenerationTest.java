import junit.framework.Assert;

import org.junit.Test;


public class PrimeGenerationTest {

	@Test
	public void shouldGenerateUpTo1() {
		verifyGeneration(1, new int[]{});
	}
	
	@Test
	public void shouldGenerateUpTo2() {
		verifyGeneration(2, new int[]{2});
	}
	
	@Test
	public void shouldGenerateUpTo3() {
		verifyGeneration(3, new int[]{2,3});
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
