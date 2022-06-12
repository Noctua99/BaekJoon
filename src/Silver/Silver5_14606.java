package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_14606 {

    public static int findMaxPleasureSum(int numOfPizzas) {

        int[] dp = new int[numOfPizzas + 1];

        for (int i = 2; i <= numOfPizzas; i++) {
            int half = i / 2;
            if (i % 2 == 0) {
                dp[i] = half * half + dp[half] + dp[half];
            } else {
                dp[i] = half * (half + 1) + dp[half] + dp[half + 1];
            }
        }

        return dp[numOfPizzas];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findMaxPleasureSum(Integer.parseInt(br.readLine())));
    }
}
