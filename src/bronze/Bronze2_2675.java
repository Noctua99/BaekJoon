package bronze;

import java.util.Scanner;

public class Bronze2_2675 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int testCase=sc.nextInt();
		
		for(int i=0;i<testCase;i++) {
			int repeatCount=sc.nextInt();
			String str=sc.next();
			
			for(int k=0;k<str.length();k++) {
				for(int j=0;j<repeatCount;j++) {
					System.out.print(str.charAt(k));
				}
			}
		}
		
		sc.close();
	}
}