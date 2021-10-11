package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver3_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] withdrawTime = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            withdrawTime[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(withdrawTime);


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += withdrawTime[i] * (n - i);
        }
        System.out.println(sum);
    }
}
