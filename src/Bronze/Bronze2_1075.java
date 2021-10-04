package Bronze;

import java.util.Scanner;

public class Bronze2_1075 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N,F;
		N=sc.nextInt();
		F=sc.nextInt();
		N=N-N%100;
		for(int i=0;i<100;i++) {
			if(N%F==0)break;
			N++;
		}
		String str=String.format("%02d",N%100);
		System.out.println(str);
		
		sc.close();
	}
}