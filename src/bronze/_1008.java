package bronze;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class _1008 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		BigDecimal num1 = new BigDecimal(sc.nextInt());
		BigDecimal num2 = new BigDecimal(sc.nextInt());
		System.out.println(num1.divide(num2, 33, RoundingMode.HALF_EVEN));

		sc.close();
	}
}