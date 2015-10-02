import recursion.*;

public class Project4 {

	public static void main(String[] args) {
		System.out.println("Test Activity 4:");
		System.out.println("Factorial:");
		for (int ii = 0; ii<10; ii ++) {
			System.out.print(Recursion.fact(ii) + "   ");
		}

		System.out.println("\n\nFibonacci:");
		for (int ii = 0; ii<10; ii ++) {
			System.out.print(Recursion.fib(ii) + "   ");
		}

		/* Test Euclid's algorithm */
		System.out.println("\n\nGCD:");
		System.out.println ("GCD of 96 and 60 is " + Recursion.gcd(96, 60));
		System.out.println ("GCD of 30 and 10 is " + Recursion.gcd(30, 10));
		System.out.println ("GCD of 96 and 120 is " + Recursion.gcd(96, 120));
		System.out.println();

		
		System.out.println("Test Project 4:");
		System.out.println("Power:");
		for (int ii = 0; ii<4; ii ++) {
			for (int jj = 0; jj<6; jj ++)  {
				System.out.print(ii + "^" + jj + "=" + Recursion.power(ii,jj) + "   ");
			}
			System.out.println();
		}

		/* Test the Ackerman function */
		System.out.println("\nAckerman:");
		for (int ii = 0; ii<4; ii ++)
		{
			for (int jj = 0; jj < 5; jj++)
			{
				System.out.print(Recursion.Ackerman(ii,jj) + "\t");
			}
			System.out.println();
		}

	}

}
