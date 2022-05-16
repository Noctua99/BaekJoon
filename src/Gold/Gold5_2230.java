package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold5_2230 {

    public static int findMinDiff(int[] arr, int M) {
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        int tempIndex = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = tempIndex; j < arr.length; j++) {
                if (arr[j] - arr[i] >= M) {
                    minDiff = Math.min(arr[j] - arr[i], minDiff);
                    tempIndex = j;
                    break;
                }
            }
        }

        return minDiff;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(findMinDiff(arr, M));
    }
}
