package bronze;

import java.util.Scanner;

public class Bronze3_2439 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for(int k=i+1;k<N;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}