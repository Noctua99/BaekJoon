package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold5_2410 {

    static final int MOD = 1_000_000_000;

    public static int solve(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = (dp[i - 1] + dp[i / 2]) % MOD;
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(Integer.parseInt(br.readLine())));
    }
}
