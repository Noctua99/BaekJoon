package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrLen = Integer.parseInt(br.readLine());
        int[] arr = new int[arrLen];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrLen; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[arrLen];
        int max = 0;

        for (int i = 0; i < arrLen; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
