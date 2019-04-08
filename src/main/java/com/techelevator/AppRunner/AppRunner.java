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
		while (true) {
			view.displayWelcomeScreen();
			int startValue = view.getInputFromUser(1);
			int endValue = view.getInputFromUser(2);
			List<Integer> primeNumbers = primeInterface.generate(startValue, endValue);
			view.printPrimeNumbers(primeNumbers);
			String userChoice = view.askUserForNextAction();
			if (!userChoice.contains("Q")) {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		View view = new View(System.in, System.out);
		AppRunner application = new AppRunner(view);
		application.run();
	}

}
