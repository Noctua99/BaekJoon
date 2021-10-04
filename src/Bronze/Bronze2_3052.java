package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze2_3052 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] intArray = new int[10];
		int[] intArray2 = new int[42];

		for (int i = 0; i < 10; i++) {
			String s = br.readLine();
			intArray[i] = Integer.parseInt(s)%42;
		}
		int count=0;
		for(int i=0;i<10;i++) {
			intArray2[intArray[i]]++;
		}
		for(int i=0;i<42;i++) {
			if(intArray2[i]!=0) {
				count++;
			}
		}
		
		bw.write(count+"");

		bw.flush();
		bw.close();

	}
}
