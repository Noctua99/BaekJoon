package Bronze;

import java.util.Scanner;

public class Bronze3_1085 {
	public static void main(String args[]) {
		int x,y;
		int w,h;
		int temp;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		
		temp=Math.min(w-x,x);
		temp=Math.min(temp,h-y);
		temp=Math.min(temp,y);
		
		System.out.println(temp);
		
		sc.close();
	}
}
