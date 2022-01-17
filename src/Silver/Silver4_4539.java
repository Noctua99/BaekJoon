package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_4539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            sb.append(round(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    public static int round(String input) {
        int len = input.length();
        double num = Double.parseDouble(input);
        for (int i = 0; i < len - 1; i++) {
            num /= 10;
            num = Math.round(num);
        }
        for (int i = 0; i < len - 1; i++) {
            num *= 10;
        }
        return (int) num;
    }
}
