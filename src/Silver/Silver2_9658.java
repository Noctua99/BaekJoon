package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2_9658 {

    public static boolean isSKWin(int n) {
        if (n <= 4) {
            return n % 2 == 0;
        }

        boolean[] dp = new boolean[n + 1];
        dp[2] = dp[4] = true;

        for (int i = 5; i <= n; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3] || !dp[i - 4];
        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isSKWin(Integer.parseInt(br.readLine())) ? "SK" : "CY");
    }
}
