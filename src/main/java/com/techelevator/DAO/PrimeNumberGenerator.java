package com.techelevator.DAO;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator implements PrimeNumberGeneratorInterface{

	@Override
	public List<Integer> generate(int startValue, int endValue) {
		List<Integer> listOfPrimeNumbers = new ArrayList<Integer>();
		
		if( endValue < startValue) {
			int storeStartValue = startValue;
			startValue = endValue;
			endValue = storeStartValue;
		}
		
		for(int i = startValue; i <= endValue; i++) {
			if(isPrime(i) && (i != 1)) {
				listOfPrimeNumbers.add(i);
			}
		}
		return listOfPrimeNumbers;
	}
  
	@Override
	public boolean isPrime(int value) {
		for(int j = 2; j < value; j++) {
			if(value % j == 0) {
				return false;
			}
		}
		return true;
	}
}
