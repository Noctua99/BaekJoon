package bronze;

import java.util.Scanner;

public class Bronze1_1110 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int units,tens;
		int count=0;
		int sum,init;
		
		units=num%10;
		tens=(num-units)/10;
		sum=units+tens;
		sum=num%10*10+sum%10;
		count++;

		for(int i=0;i<1000;i++) {
			if(num==sum)
				break;
			init=sum;
			units=sum%10;
			tens=(sum-units)/10;
			sum=units+tens;
			sum=init%10*10+sum%10;
			count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
