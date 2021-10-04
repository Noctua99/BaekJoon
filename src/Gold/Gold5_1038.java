package Gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Gold5_1038 {

	static ArrayList<Long> list;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		list = new ArrayList<>();

		if (N <= 10)
			bw.write(String.valueOf(N));
		else if (N > 1022)
			bw.write("-1");
		else {
			for (int i = 0; i < 10; i++) {
				getDownNum(i, 1);
			}
			list.sort(null);

			bw.write(String.valueOf(list.get(N)));
		}

		br.close();
		bw.flush();
		bw.close();
	}

	public static void getDownNum(long num, int idx) {
		if (idx > 10)
			return;

		list.add(num);
		for (int i = 0; i < num % 10; i++) {
			getDownNum((num * 10) + i, idx + 1);
		}
	}
}
