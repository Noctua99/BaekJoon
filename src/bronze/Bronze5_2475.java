package bronze;

import java.util.Scanner;

public class Bronze5_2475 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			sum = sum + num * num;
		}
		System.out.println(sum % 10);
	}
}
