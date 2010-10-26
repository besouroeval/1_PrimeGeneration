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
		Integer[] primes = PrimeGenerator.generate(4);
		Assert.assertEquals(2, primes.length);
		Assert.assertEquals(2, primes[0].intValue());
		Assert.assertEquals(3, primes[1].intValue());
	}
	
	@Test
	public void shouldGenerateUpTo5() {
		Integer[] primes = PrimeGenerator.generate(5);
		Assert.assertEquals(2, primes.length);
		Assert.assertEquals(2, primes[0].intValue());
		Assert.assertEquals(3, primes[1].intValue());
	}
	
}
