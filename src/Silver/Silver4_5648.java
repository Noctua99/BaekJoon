package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Silver4_5648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        ArrayList<Long> numbers = new ArrayList<>();

        while (numbers.size() < N) {
            if (st.hasMoreTokens()) {
                numbers.add(Long.parseLong(reverseString(st.nextToken())));
            } else {
                st = new StringTokenizer(br.readLine());
            }
        }

        Collections.sort(numbers);

        for (long number : numbers) {
            result.append(number).append('\n');
        }

        System.out.println(result);
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        return String.valueOf(arr);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
