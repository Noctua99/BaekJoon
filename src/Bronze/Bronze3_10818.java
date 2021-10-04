package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze3_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		int[] intArray = new int[testCase];

		for (int i = 0; i < testCase; i++) {
			intArray[i] = Integer.parseInt(st.nextToken());
		}

		int max = intArray[0];
		int min = intArray[0];

		for (int i = 1; i < testCase; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			} else if (min > intArray[i]) {
				min = intArray[i];
			}
		}
		bw.write(min + " " + max + "\n");

		bw.flush();
		bw.close();
	}

}
