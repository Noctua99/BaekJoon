package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver3_10482 {
    static boolean[] primeChecker;
    static final int MAX = 32_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        setPrimeChecker();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            StringBuilder temp = new StringBuilder();
            for (int i = 2; i <= N / 2; i++) {
                if (primeChecker[i] && primeChecker[N - i]) {
                    temp.append(i).append("+").append(N - i).append('\n');
                    count++;
                }
            }
            sb.append(N).append(" has ").append(count).append(" representation(s)").append('\n');
            sb.append(temp).append('\n');
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
