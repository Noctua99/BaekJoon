package Bronze;

import java.util.Scanner;

public class Bronze2_2577 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		String numStr = Integer.toString(A * B * C);
		String num="0123456789";
		int[] count = new int[10];

		for (int j = 0; j < numStr.length(); j++) {
			for (int i = 0; i < 10; i++) {
				if (numStr.charAt(j) == num.charAt(i)) {
					count[i]++;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(count[i]);
		}
	}
}