package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze3_10871 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1=new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2=new StringTokenizer(br.readLine(), " ");

		int testCase = Integer.parseInt(st1.nextToken());
		int integerX=Integer.parseInt(st1.nextToken());
		int[] intArray=new int[testCase];
		
		for(int i=0;i<testCase;i++) {
			intArray[i]=Integer.parseInt(st2.nextToken());
		}
		for(int i=0;i<testCase;i++) {
			if(intArray[i]<integerX) {
				bw.write(intArray[i]+" ");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
