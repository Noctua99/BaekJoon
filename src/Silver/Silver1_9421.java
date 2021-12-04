package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver1_9421 {
    static boolean[] primeChecker;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        setPrimeChecker(N);

        for (int i = 2; i <= N; i++) {
            if (primeChecker[i] && isSangGeunNum(i)) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker(int N) {
        primeChecker = new boolean[N + 1];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= N; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static boolean isSangGeunNum(int N) {
        boolean[] isVisited = new boolean[730];
        while (true) {
            int sum = 0;
            while (N > 0) {
                sum += Math.pow(N % 10, 2);
                N = N / 10;
            }
            if (sum == 1) {
                return true;
            } else if (isVisited[sum]) {
                return false;
            } else {
                isVisited[sum] = true;
            }
            N = sum;
        }
    }
}
