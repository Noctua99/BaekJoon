package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Silver5_1181 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcase = Integer.parseInt(br.readLine());

		String[] arr = new String[testcase];

		for (int i = 0; i < testcase; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} else {
				return s1.length() - s2.length();
			}
		});

		StringBuilder sb = new StringBuilder();

		sb.append(arr[0]).append('\n');

		for (int i = 1; i < testcase; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		bw.write(String.valueOf(sb));

		br.close();
		bw.flush();
		bw.close();
	}

}