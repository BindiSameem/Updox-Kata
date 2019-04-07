package com.techelevator.DAOTest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.*;

import com.techelevator.DAO.PrimeNumberGenerator;

public class PrimeNumberGeneratorTest {

	private PrimeNumberGenerator target;
	
	@Before
	public void setup() {
		target = new PrimeNumberGenerator();
	}
	
	@Test
	public void the_range_of_2_to_2_returns_one_prime_number() {
		//arrange
		int startValue = 2;
		int endValue = 2;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		int sizeOfResult = result.size();
		
		//assert
		assertEquals(1, sizeOfResult);
	}
}
