package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver4_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arrMode = new int[8001];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
            arrMode[value + 4000]++;
            sum += value;
        }

        int avg = (int) Math.round((double) sum / N);
        Arrays.sort(arr);

        int max = 0;
        int mode = 0;
        for (int i = 0; i < 8001; i++) {
            max = Math.max(max, arrMode[i]);
        }
        int count = 0;
        for (int i = 0; i < 8001; i++) {
            if (max == arrMode[i]) {
                mode = i - 4000;
                count++;
            }
            if (count == 2) {
                mode = i - 4000;
                break;
            }
        }
        sb.append(avg).append('\n');
        sb.append(arr[N / 2]).append('\n');
        sb.append(mode).append('\n');
        sb.append(arr[N - 1] - arr[0]).append('\n');

        System.out.println(sb);
    }
}
