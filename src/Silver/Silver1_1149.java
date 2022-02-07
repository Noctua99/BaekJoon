package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int houseNum = Integer.parseInt(br.readLine());

        int[][] dp = new int[houseNum + 1][3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        dp[1][0] = Integer.parseInt(st.nextToken());
        dp[1][1] = Integer.parseInt(st.nextToken());
        dp[1][2] = Integer.parseInt(st.nextToken());
        for (int i = 2; i <= houseNum; i++) {
            st = new StringTokenizer(br.readLine());
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + Integer.parseInt(st.nextToken());
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + Integer.parseInt(st.nextToken());
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.min(Math.min(dp[houseNum][0], dp[houseNum][1]), dp[houseNum][2]));
    }
}
