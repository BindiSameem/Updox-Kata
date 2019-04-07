package com.techelevator.DAO;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator implements PrimeNumberGeneratorInterface{

	@Override
	public List<Integer> generate(int startValue, int endValue) {
		List<Integer> listOfPrimeNumbers = new ArrayList<Integer>();
		for(int i = startValue; i <= endValue; i++) {
			if(i == 2) {
				listOfPrimeNumbers.add(i);
			}
		}
		return listOfPrimeNumbers;
	}

	@Override
	public boolean isPrime(int value) {
		
		return false;
	}

}
