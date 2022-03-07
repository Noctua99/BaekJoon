package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver4_1758 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfCustomers = Integer.parseInt(br.readLine());
        int[] tips = new int[numOfCustomers];

        for (int i = 0; i < tips.length; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(findMaxTipSum(tips));
    }

    public static long findMaxTipSum(int[] tips) {

        Arrays.sort(tips);
        reverseArray(tips);

        long maxTipSum = 0;
        for (int i = 0; i < tips.length; i++) {
            tips[i] -= i;

            if (tips[i] <= 0) break;

            maxTipSum += tips[i];
        }

        return maxTipSum;
    }

    public static void reverseArray(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
}
