package Bronze;

import java.util.Scanner;

public class Bronze3_2884 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int hour, minute;
		hour=sc.nextInt();
		minute=sc.nextInt();
		
		if(minute>=45) {
			minute=minute-45;
		}else {
			if(hour==0) {
				hour=24;
			}
			hour=hour-1;
			minute=minute+15;
		}
		System.out.println(hour+" "+minute);
	}

}
