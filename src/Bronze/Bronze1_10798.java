package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1_10798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] chars = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                chars[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (chars[j][i] != '\u0000') {
                    sb.append(chars[j][i]);
                }
            }
        }

        System.out.println(sb);
    }
}
