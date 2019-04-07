package com.techelevator.DAO;

import java.util.List;

public interface PrimeNumberGeneratorInterface {

	public List<Integer> generate(int startValue, int endValue);
	public boolean isPrime(int value);
}
