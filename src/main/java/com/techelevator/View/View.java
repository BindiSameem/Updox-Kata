package com.techelevator.View;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class View {

	private Scanner in;
	private PrintWriter out;
	
	public View(InputStream in, PrintStream out) {
		this.in = new Scanner(in);
		this.out = new PrintWriter(out);
	}
	
	public void displayWelcomeScreen() {
		out.print("This App returns list of prime numbers in the given range of positive integers.\n");
		out.flush();
	}
}
