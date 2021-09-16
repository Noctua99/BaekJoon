package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze3_10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		int H, W, N, num;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());

			if (N % H != 0) {
				num = (N % H) * 100 + N / H + 1;
			} else {
				num = H * 100 + N / H;
			}

			sb.append(num).append('\n');
		}

		bw.write(sb.toString());

		bw.flush();
		br.close();
		bw.close();
	}
}