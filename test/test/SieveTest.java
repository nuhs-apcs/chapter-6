package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.Sieve;

public class SieveTest {
	@Test
	public void testSieve() {
		List<Integer> expectedList = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		assertEquals(expectedList.toString(), Sieve.findPrimes(30).toString());
	}
}
