package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long sum = Long.parseLong(br.readLine());
        long start = (long) Math.sqrt(2 * sum);

        while (start * (start + 1) > 2 * sum) {
            start--;
        }

        System.out.println(start);
    }
}
