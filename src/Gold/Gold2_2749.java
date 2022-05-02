package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold2_2749 {

    static final int PERIOD = 1_500_000;
    static final int MOD = 1_000_000;
    static int[] dp = new int[PERIOD];

    public static void setDp() {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < PERIOD; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
    }

    public static int findRemainderOfNthFibonacci(long n) {
        return dp[(int) (n % PERIOD)];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        setDp();

        System.out.println(findRemainderOfNthFibonacci(Long.parseLong(br.readLine())));
    }
}
