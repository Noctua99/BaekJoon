package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze1_1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		StringBuffer sbf;

		String N;
		String reverse;
		while (true) {
			N = br.readLine();
			if (N.equals("0")) {
				break;
			}
			sbf = new StringBuffer(N);
			reverse = sbf.reverse().toString();

			if (N.equals(reverse)) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		bw.write(sb.toString());

		bw.flush();
		br.close();
		bw.close();
	}
}
