package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze2_2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String right = "12345678";
		StringBuffer sb = new StringBuffer(right);
		String reversed = sb.reverse().toString();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		s = s.replaceAll(" ", "");
		if (s.equals(right)) {
			bw.write("ascending");
		} else if (s.equals(reversed)) {
			bw.write("descending");
		} else {
			bw.write("mixed");
		}
		bw.flush();
		bw.close();
	}

}
