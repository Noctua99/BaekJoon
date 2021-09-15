package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Gold5_1011 {
	public static void main(String[] args) throws IOException {
		Gold5_1011 gold = new Gold5_1011();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int testcase = Integer.parseInt(br.readLine());

		int[] intArray = new int[testcase];

		for (int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine());
			int num = -Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			intArray[i] = gold.calc(num);
		}

		for (int i : intArray) {
			bw.write(i + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	public int calc(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 2;
		} else {
			int N = (int) Math.ceil(Math.sqrt(num));
			if (num <= (Math.pow(N, 2) - N)) {
				return 2 * N - 2;
			} else {
				return 2 * N - 1;
			}
		}
	}
}