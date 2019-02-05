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
		if (n <1 ) {
			return tmp;
		}
		else {
			return sum_up_tail(n-1, tmp+n);
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
     
    // Activity 4 int fib(int n) 
    public static int fib (int n)
    {
    	return 0;
    }
     
    // Activity 4 int power (int x, int y)
    public static int power (int x, int y) {
    	return 0;
    }
     
    // Activity 4 int triangle(int x)
    public static void triangle(int height)
    {
    }
 
    // Project 4    public static int balance (int x, int y)
    public static int balance (int x, int y) {
		return 0;
    }
     
    // Project 4    public static int Ackermann(int m, int n) 
    public static int Ackermann(int m, int n) {
		return 0;
    }

	
	// Project 4 pi_approximation(int m)
	public static double pi_approximation(int n) {
		return 0;
	}

	// Project 4 longestSubsequence(String s) 
	public static int lengthOfLongestSubsequence(String a, String b) {
		return 0;
	}

}
