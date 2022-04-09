package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bronze2_15841 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger[] dp = new BigInteger[491];

        dp[1] = dp[2] = BigInteger.ONE;
        for (int i = 3; i <= 490; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        int hour;
        while ((hour = Integer.parseInt(br.readLine())) != -1) {
            sb.append("Hour ").append(hour).append(": ").append(dp[hour]).append(" cow(s) affected\n");
        }

        System.out.println(sb);
    }
}
