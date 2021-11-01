package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] cables = new int[K];

        long min = 0;
        long max = 0;

        for (int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
            max = Math.max(cables[i], max);
        }

        max++;

        while (min < max) {     // binary search
            long mid = (min + max) / 2;
            long count = 0;

            for (int i = 0; i < K; i++) {
                count += cables[i] / mid;
            }

            if (count >= N) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        System.out.println(min - 1);
    }
}
