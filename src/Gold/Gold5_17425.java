package Gold;

import java.io.*;
import java.util.Arrays;

public class Gold5_17425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int maxCount = 1000000;
        int[] divisorSumArray = new int[maxCount + 1];
        Arrays.fill(divisorSumArray, 1);
        for (int i = 2; i <= maxCount; i++) {
            for (int j = 1; i * j <= maxCount; j++) {
                divisorSumArray[i * j] += i;
            }
        }

        long[] divisorBelowSumArray = new long[maxCount + 1];

        for (int i = 1; i <= maxCount; i++) {
            divisorBelowSumArray[i] = divisorSumArray[i] + divisorBelowSumArray[i - 1];
        }

        int testcase = Integer.parseInt(br.readLine());
        int n;
        for (int i = 0; i < testcase; i++) {
            n = Integer.parseInt(br.readLine());
            sb.append(divisorBelowSumArray[n]).append('\n');
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
