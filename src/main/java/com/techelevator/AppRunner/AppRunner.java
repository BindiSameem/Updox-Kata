package com.techelevator.AppRunner;

import java.util.List;

import com.techelevator.DAO.PrimeNumberGenerator;
import com.techelevator.DAO.PrimeNumberGeneratorInterface;
import com.techelevator.View.View;

public class AppRunner {

	private View view;
	private PrimeNumberGeneratorInterface primeInterface;


	public AppRunner(View view) {
		this.view = view;
		this.primeInterface = new PrimeNumberGenerator();
	}

	public void run() {
		view.displayWelcomeScreen();
		int startValue = view.getFirstInputFromUser();
		int endValue = view.getSecondInputFromUser();
		List<Integer> primeNumbers = primeInterface.generate(startValue, endValue);
		view.printPrimeNumbers(primeNumbers);
	}
	
	public static void main(String[] args) {
		View view = new View(System.in, System.out);
		AppRunner application = new AppRunner(view);
		application.run();
	}

}
