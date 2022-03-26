package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1343 {

    static int[] dp;

    public static int findNumOfZero(int start, int end) {
        if (start == 0) return dp[end];

        return dp[end] - dp[start - 1];
    }

    public static void setDp() {
        dp = new int[1_000_001];

        dp[0] = 1;
        for (int i = 1; i <= 1_000_000; i++) {
            int numOfZero = 0;
            int num = i;

            do {
                if (num % 10 == 0) {
                    numOfZero++;
                }
                num /= 10;

            } while (num != 0);

            dp[i] = numOfZero + dp[i - 1];
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        setDp();

        int numOfTests = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (numOfTests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            sb.append(findNumOfZero(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            )).append('\n');
        }

        System.out.println(sb);
    }
}
