package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze2_2231 {
	public static void main(String[] args) throws IOException {
		Bronze2_2231 main = new Bronze2_2231();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			if (N == i + main.sumCalc(i)) {
				bw.write(String.valueOf(i));
				break;
			}
			if (i == N) {
				bw.write("0");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

	public int sumCalc(int num) {
		if (num == 0) {
			return 0;
		} else {
			return (num % 10) + sumCalc(num / 10);
		}
	}
}

