package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold3_14905 {
    static boolean[] primeChecker;
    static final int MAX = 100_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        setPrimeChecker();

        String input = "";
        while ((input = br.readLine()) != null) {
            int N = Integer.parseInt(input);
            if (N < 8) {
                sb.append("Impossible.");
            } else if (N % 2 == 0) {
                N = N - 4;
                sb.append("2 2 ");
                for (int i = 3; i <= N / 2; i++) {
                    if (primeChecker[i] && primeChecker[N - i]) {
                        sb.append(i).append(" ").append(N - i);
                        break;
                    }
                }
            } else {
                N = N - 5;
                sb.append("2 3 ");
                for (int i = 3; i <= N / 2; i++) {
                    if (primeChecker[i] && primeChecker[N - i]) {
                        sb.append(i).append(" ").append(N - i);
                        break;
                    }
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[MAX + 1];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }
}