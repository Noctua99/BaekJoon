package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_1003 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(bf.readLine());
		int[] zeroCount = new int[41];
		int[] oneCount = new int[41];
		
		zeroCount[0]=1;
		zeroCount[1]=0;
		oneCount[0]=0;
		oneCount[1]=1;
		
		for(int i=2;i<41;i++) {
			oneCount[i]=oneCount[i-1]+oneCount[i-2];
			zeroCount[i]=oneCount[i-1];
		}
		
		for(int i=0;i<testCase;i++) {
			int num=Integer.parseInt(bf.readLine());
			System.out.println(zeroCount[num]+" "+oneCount[num]);
		}
	}

}
