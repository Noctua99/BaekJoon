package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_15624 {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
        } else {
            int[] fibo = new int[N + 1];
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i <= N; i++) {
                fibo[i] = (fibo[i - 1] + fibo[i - 2]) % MOD;
            }
            System.out.println(fibo[N]);
        }
    }
}
