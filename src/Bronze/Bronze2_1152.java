package Bronze;

import java.util.Scanner;

public class Bronze2_1152 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String stripStr = str.strip();
		int count = 1;

		if (stripStr.length()==0) {
			count--;
		} else {
			for (int i = 0; i < stripStr.length(); i++) {
				if (stripStr.charAt(i) == ' ') {
					count++;
				}
			}
		}
		System.out.println(count);

		sc.close();
	}
}
