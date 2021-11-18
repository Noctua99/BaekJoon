package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());    // 수의 개수
        int M = Integer.parseInt(st.nextToken());    // 합을 구해야 하는 횟수

        int[] numbers = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int[] partialSums = new int[N + 1];     // i까지의 부분합
        for (int i = 1; i <= N; i++) {
            partialSums[i] = partialSums[i - 1] + numbers[i];
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(partialSums[j] - partialSums[i - 1]).append('\n');
        }
        System.out.println(sb);
    }
}
