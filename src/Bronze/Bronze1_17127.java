package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze1_17127 {

    public static int findMaxSumOfP(int[] arr, int len) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            int tempSum = arrSum(arr, 0, i);
            int tempMul = arrMul(arr, i, len - 3 + i);
            tempSum += arrSum(arr, len - 3 + i, len);

            maxSum = Math.max(maxSum, tempSum + tempMul);
        }

        return maxSum;
    }

    public static int arrMul(int[] arr, int start, int end) {
        int mul = 1;
        for (int j = start; j < end; j++) {
            mul *= arr[j];
        }

        return mul;
    }

    public static int arrSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int j = start; j < end; j++) {
            sum += arr[j];
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int treeNum = Integer.parseInt(br.readLine());
        int[] trees = new int[treeNum];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < treeNum; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findMaxSumOfP(trees, treeNum));
    }
}
