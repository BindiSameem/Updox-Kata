package com.techelevator.View;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
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

	public int getFirstInputFromUser() {
		while (true) {
			try {
				out.print("\nPlease enter start integer (greater than 0): ");
				out.flush();
				String input = in.nextLine();
				if(Integer.valueOf(input) > 0) {
					return Integer.valueOf(input);
				}
			} catch (Exception e) {
				out.print("\nNot a valid entry.\n");
				out.flush();
			} 
		}
	}
	
	public int getSecondInputFromUser() {
		while (true) {
			try {
				out.print("\nPlease enter end integer (greater than 0): ");
				out.flush();
				String input = in.nextLine();
				if(Integer.valueOf(input) > 0) {
					return Integer.valueOf(input);
				}
			} catch (Exception e) {
				out.print("\nNot a valid entry.\n");
				out.flush();
			}
		}
	}
	
	public void printPrimeNumbers(List<Integer> primeNumbers) {
		out.print("\nThe list of prime numbers: ");
		out.print("\n");
		for(Integer i : primeNumbers) {
			out .println(i);
		}
		out.flush();
	}
}
