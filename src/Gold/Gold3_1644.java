package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Gold3_1644 {

    public static int findNumOfCases(int n) {
        if (n == 1) return 0;

        boolean[] sieve = new boolean[n + 1];

        Arrays.fill(sieve, true);

        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                primeNumbers.add(i);
            }
        }

        int[] dp = new int[primeNumbers.size() + 1];

        dp[1] = primeNumbers.get(0);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + primeNumbers.get(i - 1);
        }

        int pt1 = 0;
        int pt2 = 1;

        int count = 0;

        while (pt2 < dp.length) {
            if (dp[pt2] - dp[pt1] == n) {
                count++;
                pt2++;
            } else if (dp[pt2] - dp[pt1] > n) {
                pt1++;
            } else {
                pt2++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findNumOfCases(Integer.parseInt(br.readLine())));
    }
}
