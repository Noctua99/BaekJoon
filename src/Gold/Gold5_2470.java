package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold5_2470 {

    public static String findTwoSolutionCloseToZero(int[] arr, int left, int right) {
        int closeLeft = -1;
        int closeRight = -1;
        int closeToZero = Integer.MAX_VALUE;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (closeToZero > Math.abs(sum)) {
                closeLeft = left;
                closeRight = right;
                closeToZero = Math.abs(sum);
            }

            if (sum == 0) {
                break;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return (arr[closeLeft] + " " + arr[closeRight]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int solutionCount = Integer.parseInt(br.readLine());

        int[] solutions = new int[solutionCount];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < solutionCount; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(solutions);

        System.out.println(findTwoSolutionCloseToZero(solutions, 0, solutionCount - 1));
    }
}
