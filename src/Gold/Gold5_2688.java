package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold5_2688 {
    public static void main(String[] args) throws IOException {
        long[][] dp = new long[65][10];
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= 64; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            long sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += dp[N][i];
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
