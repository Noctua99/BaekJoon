package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_4375 {

    public static int solve(int n) {
        int num = 0;

        for (int i = 1; ; i++) {
            num = num * 10 + 1;
            num %= n;

            if (num == 0) return i;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
        while ((input = br.readLine()) != null) {
            sb.append(solve(Integer.parseInt(input))).append('\n');
        }

        System.out.println(sb);
    }
}
