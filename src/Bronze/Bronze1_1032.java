package Bronze;

import java.util.Scanner;

public class Bronze1_1032 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] str = new String[count];
		str[0] = sc.next();
		int length = str[0].length();
		char[] arr1, arr2 = new char[length];
		arr1 = str[0].toCharArray();
		for (int i = 1; i < count; i++) {
			str[i] = sc.next();
			arr2 = str[i].toCharArray();
			for (int j = 0; j < length; j++) {
				if ((arr1[j] == '?') || (arr1[j] == arr2[j])) {
					continue;
				} else {
					arr1[j] = '?';
				}
			}

		}
		String strfinal = new String(arr1);
		System.out.println(strfinal);

		sc.close();
	}
}