package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_2491 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxLen = 1;
        int tempLen = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] >= arr[i - 1]) {
                tempLen++;
            } else {
                maxLen = Math.max(maxLen, tempLen);
                tempLen = 1;
            }
        }

        maxLen = Math.max(maxLen, tempLen);
        tempLen = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] <= arr[i - 1]) {
                tempLen++;
            } else {
                maxLen = Math.max(maxLen, tempLen);
                tempLen = 1;
            }
        }

        maxLen = Math.max(maxLen, tempLen);

        System.out.println(maxLen);
    }
}
