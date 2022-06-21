package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Gold5_2294 {

    static HashSet<Integer> coins;
    static int target;

    public static int findMinNumOfCoins() {
        int[] dp = new int[target + 1];

        Arrays.fill(dp, 100_001);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= target; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[target] == 100_001 ? -1 : dp[target];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int coinsNum = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());

        coins = new HashSet<>();

        for (int i = 0; i < coinsNum; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(findMinNumOfCoins());
    }
}
