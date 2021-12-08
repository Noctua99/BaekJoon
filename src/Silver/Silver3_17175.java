package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_17175 {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N <= 1) {
            System.out.println(1);
        } else {
            int[] fiboCount = new int[N + 1];
            fiboCount[0] = 1;
            fiboCount[1] = 1;
            for (int i = 2; i <= N; i++) {
                fiboCount[i] = (fiboCount[i - 1] + fiboCount[i - 2] + 1) % MOD;
            }
            System.out.println(fiboCount[N]);
        }
    }
}
