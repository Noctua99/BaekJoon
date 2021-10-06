package Silver;

import java.io.*;
import java.util.Arrays;

public class Silver2_17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] divisorSumArray = new int[n + 1];
        Arrays.fill(divisorSumArray, 1);
        for (int i = 2; i <= n; i++) {
            for (int j = 1; i * j <= n; j++) {
                divisorSumArray[i * j] += i;
            }
        }

        long[] divisorBelowSumArray = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            divisorBelowSumArray[i] = divisorSumArray[i] + divisorBelowSumArray[i - 1];
        }

        bw.write(divisorBelowSumArray[n] + "\n");
        bw.flush();
        bw.close();
    }
}
