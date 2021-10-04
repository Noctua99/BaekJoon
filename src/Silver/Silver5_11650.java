package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_11650 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int testcase = Integer.parseInt(br.readLine());

		int[][] intArray = new int[testcase][2];

		for (int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine());
			intArray[i][0] = Integer.parseInt(st.nextToken());
			intArray[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(intArray, (n1, n2) -> {
			if (n1[0] == n2[0]) {
				return n1[1] - n2[1];
			} else {
				return n1[0] - n2[0];
			}
		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < testcase; i++) {
			sb = sb.append(intArray[i][0]).append(" ").append(intArray[i][1]).append('\n');
		}

		bw.write(String.valueOf(sb));

		br.close();
		bw.flush();
		bw.close();
	}
}
