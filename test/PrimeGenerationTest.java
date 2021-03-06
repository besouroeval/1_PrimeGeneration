import junit.framework.Assert;

import org.junit.Test;


public class PrimeGenerationTest {

	@Test
	public void shouldGenerateUpToN() {
		verifyGeneration(1, new int[]{});
		verifyGeneration(2, new int[]{2});
		verifyGeneration(3, new int[]{2,3});
		verifyGeneration(4, new int[]{2,3});
		verifyGeneration(5, new int[]{2,3,5});
		verifyGeneration(6, new int[]{2,3,5});
		verifyGeneration(7, new int[]{2,3,5,7});
		verifyGeneration(8, new int[]{2,3,5,7});
		verifyGeneration(9, new int[]{2,3,5,7});
		verifyGeneration(10, new int[]{2,3,5,7});
		verifyGeneration(11, new int[]{2,3,5,7,11});
		verifyGeneration(12, new int[]{2,3,5,7,11});
		verifyGeneration(13, new int[]{2,3,5,7,11,13});
		verifyGeneration(15, new int[]{2,3,5,7,11,13});
		verifyGeneration(18, new int[]{2,3,5,7,11,13,17});
		verifyGeneration(21, new int[]{2,3,5,7,11,13,17,19});
		verifyGeneration(50, new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47});
	}

	private void verifyGeneration(int i, int[] expected) {
		Integer[] primes = PrimeGenerator.generate(i);
		Assert.assertEquals(expected.length, primes.length);
		for (int n = 0 ; n<expected.length ; n++)
			Assert.assertEquals(expected[n], primes[n].intValue());
	}
	
}
