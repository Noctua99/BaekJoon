package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver4_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int len = input.length();

        String[] suffixes = new String[len];
        for (int i = 0; i < len; i++) {
            suffixes[i] = input.substring(i);
        }

        Arrays.sort(suffixes);

        for (String suffix : suffixes) {
            sb.append(suffix).append('\n');
        }

        System.out.println(sb);
    }
}
