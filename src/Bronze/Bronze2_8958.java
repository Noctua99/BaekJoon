package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze2_8958 {
	public static void main(String args[]) {
		Bronze2_8958 bron = new Bronze2_8958();
		bron.OXCalculator();
	}

	public void OXCalculator() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		;
		int testCase = 0;
		String input = null;
		try {
			testCase = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < testCase; i++) {
			try {
				input = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			int count = 0;
			int plus = 1;

			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == 'O') {
					count = count + plus;
					plus++;
				} else {
					plus = 1;
				}
			}
			try {
				bw.write(count+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
