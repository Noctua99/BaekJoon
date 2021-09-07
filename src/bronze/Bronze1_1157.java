package bronze;

import java.util.Scanner;

public class Bronze1_1157 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= (str.charAt(i)) && (str.charAt(i) <= 90)) {
				arr[str.charAt(i) - 'A']++;
			} else {
				arr[str.charAt(i) - 'a']++;
			}
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);

		sc.close();
	}
}
