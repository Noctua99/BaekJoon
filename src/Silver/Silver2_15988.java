package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2_15988 {

    static final int MOD = 1_000_000_009;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] dp = new int[1_000_001];

        // set dp
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= 1_000_000; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) % MOD + dp[i - 3] % MOD) % MOD;
        }

        int numOfTestCases = Integer.parseInt(br.readLine());
        while (numOfTestCases-- > 0) {
            sb.append(dp[Integer.parseInt(br.readLine())]).append('\n');
        }

        System.out.println(sb);
    }
}
