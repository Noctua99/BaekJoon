package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold4_1806 {

    static int N, S;
    static int[] sumArr;

    public static int findMinLength() {
        if (sumArr[N] < S) {
            return 0;
        }

        int left = 0;
        int right = 1;
        int minLen = Integer.MAX_VALUE;

        while (right <= N) {
            if (sumArr[right] - sumArr[left] >= S) {
                minLen = Math.min(minLen, right - left);
                left++;
            } else {
                right++;
            }
        }

        return minLen;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        sumArr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sumArr[i] = Integer.parseInt(st.nextToken()) + sumArr[i - 1];
        }

        System.out.println(findMinLength());
    }
}
