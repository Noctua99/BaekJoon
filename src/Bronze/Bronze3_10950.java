package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze3_10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

		int testCase = Integer.parseInt(st1.nextToken());

		for (int i = 0; i < testCase; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			int a=Integer.parseInt(st2.nextToken());
			int b=Integer.parseInt(st2.nextToken());
			bw.write((a+b)+"\n");
		}
		bw.flush();
		bw.close();
	}

}
