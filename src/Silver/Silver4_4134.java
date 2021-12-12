package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            long number = Long.parseLong(br.readLine());
            if (number <= 2) {
                sb.append(2).append('\n');
            } else {
                while (true) {
                    boolean isPrime = true;
                    for (int i = 2; (long) i * i <= number; i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        sb.append(number).append('\n');
                        break;
                    }
                    number++;
                }
            }
        }
        System.out.println(sb);
    }
}
