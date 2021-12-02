package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver1_6718 {
    static boolean[] primeChecker;
    static final int MAX = 32_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        setPrimeChecker();

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            int count = 0;
            for (int i = 2; i <= N / 2; i++) {
                if (primeChecker[i] && primeChecker[N - i]) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[MAX + 1];
        Arrays.fill(primeChecker, true);

        for (int i = 2; i * i <= MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }
}
