package recursion;

import java.util.Scanner;

public class Recursion {

	// Class example
	public static int sum_up(int n) {
		if (n <=1 ) {
			return 1;
		}
		else {
			return n + sum_up(n-1);
		}
	}
	
	// Class example
	public static int sum_up_tail(int n) {
		return sum_up_tail(n, 0);
	}
	public static int sum_up_tail(int n, int tmp) {
		if (n <1 ) {
			return tmp;
		}
		else {
			return sum_up_tail(n-1, tmp+n);
		}
	}
	
	// Activity 4 int fact(int n) 
	
	// Activity 4 int fib(int n) 
	
	// Activity 4 int gcd(int num1, int num2)


    // Project 4 int power (int x, int y)
	
	// Project 4 balance(int x, int y)
	
    // Project 4 int ack(int m, int n) 
	
	// Project 4 playGuessingGame(int m);

}
