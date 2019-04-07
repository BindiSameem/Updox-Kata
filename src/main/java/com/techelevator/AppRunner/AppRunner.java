package com.techelevator.AppRunner;

import com.techelevator.View.View;

public class AppRunner {

	private View view;
	

	public AppRunner(View view) {
		this.view = view;
	}

	public void run() {
		view.displayWelcomeScreen();
		int startValue = view.getFirstInputFromUser();
	}
	
	public static void main(String[] args) {
		View view = new View(System.in, System.out);
		AppRunner application = new AppRunner(view);
		application.run();
	}

}
