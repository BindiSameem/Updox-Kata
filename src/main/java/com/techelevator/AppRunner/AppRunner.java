package com.techelevator.AppRunner;

import com.techelevator.View.View;

public class AppRunner {

	private View view;
	

	public AppRunner(View menu) {
		this.view = view;
	}

	public void run() {
		
	}
	
	public static void main(String[] args) {
		View menu = new View(System.in, System.out);
		AppRunner application = new AppRunner(menu);
		application.run();
	}

}
