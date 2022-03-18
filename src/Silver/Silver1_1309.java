package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1_1309 {

    public static int findNumOfCases(int sizeOfCage) {
        int[] dp = new int[sizeOfCage + 1];
        dp[0] = 1;
        dp[1] = 3;
        for (int i = 2; i <= sizeOfCage; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 2]) % 9901;
        }

        return dp[sizeOfCage];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findNumOfCases(Integer.parseInt(br.readLine())));
    }
}
