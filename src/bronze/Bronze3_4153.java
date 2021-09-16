package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bronze3_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int[] intArray = new int[3];
		StringBuilder sb = new StringBuilder();
		while (true) {
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < 3; i++) {
				intArray[i] = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
			}

			if (intArray[0] + intArray[1] + intArray[2] == 0)
				break;

			Arrays.sort(intArray);

			if (intArray[0] + intArray[1] == intArray[2]) {
				sb.append("right").append('\n');
			} else {
				sb.append("wrong").append('\n');
			}

		}

		bw.write(sb.toString());

		bw.flush();
		br.close();
		bw.close();
	}
}
