package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 두 원의 교점을 구하는 문제
// 반지름을 비교하면 쉽게 풀 수 있다
public class Silver4_1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int testcase = Integer.parseInt(br.readLine());
		int x1 = 0, y1 = 0, r1 = 0;
		int x2 = 0, y2 = 0, r2 = 0;
		int distance = 0;

		for (int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

			if (x1 == x2 && y1 == y2 && r1 == r2)
				bw.write(-1 + "\n");
			else if (distance > Math.pow((r1 + r2), 2) || distance < Math.pow((r1 - r2), 2))
				bw.write(0 + "\n");
			else if (distance == Math.pow(r1 + r2, 2) || distance == Math.pow(r1 - r2, 2))
				bw.write(1 + "\n");
			else {
				bw.write(2 + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
