package bronze;

import java.util.Scanner;

public class Bronze2_2562 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int[] arrInt=new int[9];
		
		for(int i=0;i<9;i++) {
			arrInt[i]=sc.nextInt();
		}
		
		int max=0;
		int maxIndex=0;
		
		for(int i=0;i<9;i++) {
			if(arrInt[i]>max) {
				max=arrInt[i];
				maxIndex=i+1;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);
	}
}
