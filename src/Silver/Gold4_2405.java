package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold4_2405 {

    public static int findMaxDiff(int[] arr, int len) {

        Arrays.sort(arr);

        int ans = 0;

        for (int i = 0; i < len - 2; i++) {
            ans = Math.max(ans, Math.abs(arr[i] - arr[i + 1] * 2 + arr[len - 1]));
        }
        for (int i = 1; i < len - 1; i++) {
            ans = Math.max(ans, Math.abs(arr[0] - arr[i] * 2 + arr[i + 1]));
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfIntegers = Integer.parseInt(br.readLine());
        int[] numbers = new int[numOfIntegers];

        for (int i = 0; i < numOfIntegers; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(findMaxDiff(numbers, numOfIntegers));
    }
}
