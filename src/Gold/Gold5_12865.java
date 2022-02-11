package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold5_12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int itemsNum = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());

        int[] values = new int[itemsNum + 1];
        int[] weights = new int[itemsNum + 1];
        for (int i = 1; i <= itemsNum; i++) {
            st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[itemsNum + 1][maxWeight + 1];
        for (int i = 1; i <= itemsNum; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if (weights[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(values[i] + dp[i - 1][j - weights[i]], dp[i - 1][j]);
                }
            }
        }

        System.out.println(dp[itemsNum][maxWeight]);
    }
}
