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
	 
	@Test
	public void the_range_of_2_to_3_returns_two_prime_numbers() {
		//arrange
		int startValue = 2;
		int endValue = 3;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		int sizeOfResult = result.size();
		
		//assert
		assertEquals(2, sizeOfResult);
		assertEquals(new Integer(2), result.get(0));
		assertEquals(new Integer(3), result.get(1));
	}
	
	@Test
	public void the_range_of_2_to_5_returns_three_prime_numbers() {
		//arrange
		int startValue = 2;
		int endValue = 5;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		int sizeOfResult = result.size();
		
		//assert
		assertEquals(3, sizeOfResult);
		assertEquals(new Integer(2), result.get(0));
		assertEquals(new Integer(3), result.get(1));
		assertEquals(new Integer(5), result.get(2));
	}
	
	@Test
	public void the_range_of_2_to_7_returns_four_prime_numbers() {
		//arrange
		int startValue = 2;
		int endValue = 7;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		int sizeOfResult = result.size();
		
		//assert
		assertEquals(4, sizeOfResult);
		assertEquals(new Integer(2), result.get(0));
		assertEquals(new Integer(3), result.get(1));
		assertEquals(new Integer(5), result.get(2));
		assertEquals(new Integer(7), result.get(3));
	}
	
	@Test
	public void the_range_of_2_to_11_returns_five_prime_numbers() {
		//arrange
		int startValue = 2;
		int endValue = 11;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		int sizeOfResult = result.size();
		
		//assert
		assertEquals(5, sizeOfResult);
		assertEquals(new Integer(2), result.get(0));
		assertEquals(new Integer(3), result.get(1));
		assertEquals(new Integer(5), result.get(2));
		assertEquals(new Integer(7), result.get(3));
		assertEquals(new Integer(11), result.get(4));
	}
	
	@Test
	public void the_range_of_7900_to_7920_returns_three_prime_numbers() {
		// arrange
		int startValue = 7900;
		int endValue = 7920;

		// act
		List<Integer> result = target.generate(startValue, endValue);

		// assert
		assertEquals(3, result.size());
		assertEquals(new Integer(7901), result.get(0));
		assertEquals(new Integer(7907), result.get(1));
		assertEquals(new Integer(7919), result.get(2));
	}
	
	@Test
	public void the_range_of_1_to_1_returns_zero_prime_numbers() {
		//arrange
		int startValue = 1;
		int endValue = 1;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		
		//assert
		assertEquals(0, result.size());
	}
	
	@Test
	public void the_range_of_11_to_1_returns_five_prime_numbers_in_ascending_order() {
		//arrange
		int startValue = 11;
		int endValue = 1;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
 
		//assert
		assertEquals(5, result.size());
		assertEquals(new Integer(2), result.get(0));
		assertEquals(new Integer(3), result.get(1));
		assertEquals(new Integer(5), result.get(2));
		assertEquals(new Integer(7), result.get(3));
		assertEquals(new Integer(11), result.get(4));
	}	
	 
	@Test
	public void the_range_of_7920_to_7900_returns_three_prime_numbers_in_ascending_order() {
		// arrange
		int startValue = 7920;
		int endValue = 7900;

		// act
		List<Integer> result = target.generate(startValue, endValue);

		// assert
		assertEquals(3, result.size());
		assertEquals(new Integer(7901), result.get(0));
		assertEquals(new Integer(7907), result.get(1));
		assertEquals(new Integer(7919), result.get(2));
	}
}
