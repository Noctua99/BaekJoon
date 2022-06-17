package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_2003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        arr[1] = Integer.parseInt(st.nextToken());
        for (int i = 2; i <= N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int pt1 = 0;
        int pt2 = 1;

        while (pt2 <= N) {
            if (arr[pt2] - arr[pt1] == M) {
                count++;
                pt2++;
            } else if (arr[pt2] - arr[pt1] > M) {
                pt1++;
            } else {
                pt2++;
            }
        }

        System.out.println(count);
    }
}
