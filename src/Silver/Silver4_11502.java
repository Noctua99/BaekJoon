package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver4_11502 {
    static boolean[] primeChecker;
    static final int MAX = 1_000;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        setPrimeChecker();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            if (K == 7) {
                sb.append("2 2 3").append('\n');
            } else {
                goldbachConjecture(K);
            }
        }

        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[MAX];
        Arrays.fill(primeChecker, true);

        for (int i = 2; i * i < MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static void goldbachConjecture(int K) {
        K = K - 3;
        for (int i = 3; i < K; i++) {
            if (primeChecker[i]) {
                for (int j = 3; j < K; j++) {
                    if (primeChecker[j]) {
                        if (i + j == K) {
                            sb.append("3 ").append(i).append(" ").append(j).append('\n');
                            return;
                        }
                    }
                }
            }
        }
    }
}
