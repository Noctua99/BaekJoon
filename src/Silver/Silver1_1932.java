package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int triangleSize = Integer.parseInt(br.readLine());

        int[][] dp = new int[triangleSize][triangleSize];
        dp[0][0] = Integer.parseInt(br.readLine());
        for (int i = 1; i < triangleSize; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i][0] = dp[i - 1][0] + Integer.parseInt(st.nextToken());
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(maxArray(dp[triangleSize - 1]));
    }

    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
