package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_9657 {

    public static boolean isSKWin(int N) {
        if (N <= 4) {
            return N != 2;
        }

        boolean[] dp = new boolean[N + 1];
        dp[1] = dp[3] = dp[4] = true;

        for (int i = 5; i <= N; i++) {
            dp[i] = !(dp[i - 1] && dp[i - 3] && dp[i - 4]);
        }

        return dp[N];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isSKWin(Integer.parseInt(br.readLine())) ? "SK" : "CY");
    }
}
