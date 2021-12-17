package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver2_16424 {
    static boolean[] primeChecker;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        setPrimeChecker(N);

        int count = 0;
        while (N > 2) {
            for (int i = 2; i <= N / 2; i++) {
                if (primeChecker[i] && primeChecker[N - i]) {
                    N -= i * 2;
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }

    public static void setPrimeChecker(int len) {
        primeChecker = new boolean[len + 1];
        Arrays.fill(primeChecker, true);
        for (int i = 2; i * i <= len; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= len; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }
}
