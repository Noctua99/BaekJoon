package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze2_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		br.readLine();
		String str = br.readLine();
		int length = str.length();

		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + str.charAt(i)-'0';
		}

		bw.write(String.valueOf(sum));

		bw.flush();
		bw.close();
	}

}