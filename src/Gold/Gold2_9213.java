package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold2_9213 {
    public static void main(String[] args) throws IOException {
        final int MAX = 1_000_000;
        int[] sumOfFactors = new int[MAX];
        for (int i = 1; i < MAX; i++) {
            for (int j = i * 2; j < MAX; j += i) {
                sumOfFactors[j] += i;
            }
        }
        for (int i = 1; i < MAX; i++) {
            sumOfFactors[i] = Math.abs(sumOfFactors[i] - i);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int badness = Integer.parseInt(st.nextToken());

        for (int t = 1; ; t++) {
            int count = 0;
            for (int i = start; i <= end; i++) {
                if (sumOfFactors[i] <= badness) {
                    count++;
                }
            }
            sb.append("Test ").append(t).append(": ").append(count).append('\n');

            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            badness = Integer.parseInt(st.nextToken());

            if (start == 0 && end == 0 && badness == 0)
                break;
        }
        System.out.print(sb);
    }
}
