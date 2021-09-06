package bronze;

import java.util.Scanner;

public class Bronze3_1009 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int total = 1;
			for (int j = 0; j < num2; j++) {
				total = total * num1;
				total = total - total / 10 * 10;
				if(total==0)total=10;
			}
			arr[i] = total;
		}
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}
}
//package bronze;
//
//import java.util.Scanner;
//
//public class _1009 {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int num1;
//		int num2;
//		int total;
//		int count = sc.nextInt();
//		for (int i = 0; i < count; i++) {
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//			total = 1;
//			for (int j = 0; j < num2; j++) {
//				total = (num1 * total) % 10;
//			}
//			if (total == 0) {
//				total = 10;
//			}
//			System.out.println(total);
//		}
//
//		sc.close();
//	}
//}