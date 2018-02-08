package recursion;

public class Recursion {
	
	// Class example
	public static int sum_up(int n) {
		if (n <=0 ) {
			return 0;
		}
		else {
			return n + sum_up(n-1);
		}
	}

	public static int sum_up_tail(int n) {
		return sum_up_tail(n, 0);
	}
	public static int sum_up_tail(int n, int tmp) {
		if (n < 1 ) {
			return tmp;
		}
		else {
			return sum_up_tail(n-1, tmp+n);
		}
	}
    
    public static void print_up_to(int n) {
    	if (n >= 1) {
    		print_up_to(n, 1);
    	}
    	System.out.println();
    }
    	
    public static void print_up_to(int n, int current) {
    	System.out.print(current + " ");
    	if (n > 1) {
    		print_up_to(n-1, current+1);
    	}
    }
    
    public static int fact (int n)
    {
        int ret;
         
        if (n <= 1)
            ret = 1;
        else
            ret = n * fact(n-1);
         
        return ret;
    }
     
    // Activity 4 
    // public static int fib (int n)
    // public static int gcd(int num1, int num2)
    // public static int power (int x, int y)

    // Project 4 
    // public static int balance (int x, int y)
    // public static int Ackermann(int m, int n)
	// public static double pi_approximation(int n)
	// public static double pi_approximation_helper (int n, double pi)
	// public static void collatz(int n)
}
