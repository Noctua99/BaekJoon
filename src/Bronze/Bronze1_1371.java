package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bronze1_1371 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] alp = new int[26];

        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);

            while (st.hasMoreTokens()) {
                String word = st.nextToken();

                for (int i = 0; i < word.length(); i++) {
                    alp[word.charAt(i) - 'a']++;
                }
            }
        }

        int max = Arrays.stream(alp).max().getAsInt();

        for (int i = 0; i < 26; i++) {
            if (alp[i] == max) {
                sb.append((char) (i + 'a'));
            }
        }

        System.out.println(sb);
    }
}
