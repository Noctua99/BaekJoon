package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver1_12852 {

    public static String solve(int N) {

        int[][] dp = new int[2][N + 4];

        Arrays.fill(dp[0], Integer.MAX_VALUE);

        dp[0][1] = 0;
        dp[0][2] = dp[0][3] = 1;

        dp[1][2] = dp[1][3] = 1;

        for (int i = 4; i <= N; i++) {
            if (i % 3 == 0 && dp[0][i / 3] + 1 < dp[0][i]) {
                dp[0][i] = dp[0][i / 3] + 1;
                dp[1][i] = i / 3;
            }

            if (i % 2 == 0 && dp[0][i / 2] + 1 < dp[0][i]) {
                dp[0][i] = dp[0][i / 2] + 1;
                dp[1][i] = i / 2;
            }

            if (dp[0][i - 1] + 1 < dp[0][i]) {
                dp[0][i] = dp[0][i - 1] + 1;
                dp[1][i] = i - 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(dp[0][N]).append('\n');

        int index = N;
        while (dp[1][index] != 0) {
            sb.append(index).append(' ');
            index = dp[1][index];
        }
        sb.append(index);

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(Integer.parseInt(br.readLine())));
    }
}
