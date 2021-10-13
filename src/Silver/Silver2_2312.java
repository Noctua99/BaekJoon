package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver2_2312 {
    static boolean[] primeNumber = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Arrays.fill(primeNumber, true);
        SieveOfEratosthenes();


        int testCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCount; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n; j++) {
                int count = 0;
                if (primeNumber[j]) {
                    while (n % j == 0) {
                        n /= j;
                        count++;
                    }
                    if (count > 0) {
                        sb.append(j).append(" ").append(count).append('\n');
                    }
                }
            }
        }
        System.out.print(sb);
    }

    public static void SieveOfEratosthenes() {
        for (int i = 2; i * i <= 100000; i++) {
            if (primeNumber[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    primeNumber[j] = false;
                }
            }
        }
    }
}
