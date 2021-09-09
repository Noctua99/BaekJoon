package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze2_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] alph = new int[26];
		String s = br.readLine();

		for (int i = 0; i < 26; i++) {
			alph[i] = -1;
		}
//		bw.newLine();
		for (int i = 0; i < s.length(); i++) {
			if(alph[s.charAt(i)-'a']!=-1)
				continue;
			alph[s.charAt(i)-'a']=i;
		}
		
//		for (int var:alph) {
//			System.out.print(var+" ");
//		}

		for (int var:alph) {
			bw.write(var+" ");
		}
		
		bw.flush();
		bw.close();
	}

}
