package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Silver5_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int length = str.length();
		int[] intArray = new int[length];

		for (int i = 0; i < length; i++) {
			intArray[i] = str.charAt(i) - '0';
		}

		Arrays.sort(intArray);
		
		for (int i = 0; i < length; i++) {
			bw.write(String.valueOf(intArray[length-i-1]));
		}
		bw.flush();
		bw.close();
	}

}
