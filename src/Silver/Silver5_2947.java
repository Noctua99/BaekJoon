package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_2947 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int len = st.countTokens();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            boolean isSwapped = false;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sb.append(arrToStr(arr));
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

        System.out.println(sb);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String arrToStr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int data : arr) {
            sb.append(data).append(" ");
        }
        sb.append('\n');
        return sb.toString();
    }
}
