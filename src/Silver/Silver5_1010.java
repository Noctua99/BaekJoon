package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1010 {

    static int[][] dp = new int[30][30];

    public static int solve(int n, int r) {
        return dp[n][r];
    }

    public static void setDp() {
        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        setDp();

        int numOfTests = Integer.parseInt(br.readLine());

        while (numOfTests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(solve(M, N)).append('\n');
        }

        System.out.println(sb);
    }
}
