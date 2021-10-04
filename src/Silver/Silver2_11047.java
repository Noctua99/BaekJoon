package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Silver2_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] intArray = new int[N];
		for (int i = N - 1; i >= 0; i--) {
			intArray[i] = Integer.parseInt(br.readLine());
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			if (intArray[i] <= K) {
				count = count + K / intArray[i];
				K = K % intArray[i];
			} else {
				continue;
			}
		}

		bw.write(String.valueOf(count));

		bw.flush();
		br.close();
		bw.close();
	}
}
