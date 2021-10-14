package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver4_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCount = Integer.parseInt(br.readLine());

        int[] first = new int[testCount];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < testCount; i++) {
            first[i] = Integer.parseInt(st.nextToken());
        }

        int[] second = new int[testCount];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < testCount; i++) {
            second[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(first);
        Arrays.sort(second);

        int sum = 0;
        for (int i = 0; i < testCount; i++) {
            sum += first[i] * second[testCount - i - 1];
        }
        System.out.println(sum);
    }
}
