package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Gold5_2226 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
        } else if (N <= 3) {
            System.out.println(1);
        } else {
            System.out.println(seqZeroCounter(N));
        }
    }

    public static BigInteger seqZeroCounter(int N) {
        BigInteger[] dp = new BigInteger[N + 1];
        dp[3] = BigInteger.ONE;

        for (int i = 4; i <= N; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i - 1].multiply(BigInteger.TWO).add(BigInteger.ONE);
            } else {
                dp[i] = dp[i - 1].multiply(BigInteger.TWO).subtract(BigInteger.ONE);
            }
        }
        return dp[N];
    }
}