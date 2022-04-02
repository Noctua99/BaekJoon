package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_2435 {

    public static int findMaxSum(int[] arr, int len, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= len - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int dayNum = Integer.parseInt(st.nextToken());  // 온도를 측정한 전체 날짜의 수
        int K = Integer.parseInt(st.nextToken());   // 합을 구하기 위한 연속적인 날짜의 수

        int[] temperatures = new int[dayNum];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < dayNum; i++) {
            temperatures[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findMaxSum(temperatures, dayNum, K));
    }
}
