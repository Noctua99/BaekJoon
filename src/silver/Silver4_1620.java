package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver4_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> mapA = new HashMap<>();
		HashMap<Integer, String> mapB = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			mapA.put(s, i + 1);
			mapB.put(i + 1, s);
		}
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (Character.isDigit(s.charAt(0))) {
				int a = Integer.parseInt(s);
				bw.write(mapB.get(a) + "\n");
			} else {
				bw.write(mapA.get(s) + "\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}