package GCDProgram;

import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two integers for calculating GCD");
		int m = scan.nextInt();
		int n = scan.nextInt();
		int gcd = GCD.findGCD(m, n);
		System.out.println("The GCD of " + m + " & " + n + " is: " +gcd);
	}

}
