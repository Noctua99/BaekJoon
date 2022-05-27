package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_6571 {

    static final int MOD = 1_000_000_007;

    public static int findNumOfRecurExecutions(int n) {
        int a = 2;
        int b = 3;

        for (int i = 5; i <= n; i++) {
            int temp = b;
            b = (a + b) % MOD;
            a = temp;
        }

        return b;
    }

    public static int findNumOfDynamicExecutions(int n) {
        return n - 2;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(findNumOfRecurExecutions(n) + " " + findNumOfDynamicExecutions(n));
    }
}
