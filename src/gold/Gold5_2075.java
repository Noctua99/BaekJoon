package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold5_2075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int testcase = Integer.parseInt(br.readLine());
		int[] intArray = new int[testcase * testcase];

		for (int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = testcase * i; j < testcase * (i + 1); j++) {
				intArray[j] = Integer.parseInt(st.nextToken());
			}
		}

		Arrays.sort(intArray);

		bw.write(String.valueOf(intArray[testcase * testcase - testcase]));

		bw.flush();
		bw.close();
	}

}
