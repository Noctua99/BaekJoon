package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Silver5_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		String[] CroatiaAlph = { "c=", "c-", "d-", "lj", "nj", "s=", "z=" };
		int count = 0;
		int count3 = 0;

		for (int c = 0; c < 7; c++) {
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.substring(i, i + 2).equals(CroatiaAlph[c])) {
					count++;
				}
			}
		}
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.substring(i, i + 3).equals("dz=")) {
				count3++;
				count--;
			}
		}
		count = count + (s.length() - 2 * count - 3 * count3) + count3;
		bw.write(String.valueOf(count));

		bw.flush();
		bw.close();
	}
}
