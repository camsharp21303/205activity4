import Recursion.*;

public class Activity4 {

	public static void main(String[] args) {

		for (int ii=0;ii<10;ii++) {
			System.out.println("sum_up " + ii + ": " + Recursion.sum_up(ii));
		}
		for (int ii=0;ii<10;ii++) {
			System.out.println("sum_up_tail " + ii + ": " + Recursion.sum_up_tail(ii));
		}
	}

}
