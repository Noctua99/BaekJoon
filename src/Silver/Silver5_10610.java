package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver5_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String result = "";

        if (isMultipleOfThree(input) && input.contains("0")) {
            result = stringReverseSort(input);
        } else {
            result = "-1";
        }
        System.out.println(result);
    }

    public static boolean isMultipleOfThree(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) - '0');
        }
        return sum % 3 == 0;
    }

    public static String stringReverseSort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(reverseCharArray(arr));
    }

    public static char[] reverseCharArray(char[] arr) {
        int len = arr.length;
        char[] reversedArr = new char[len];
        for (int i = 0; i < len; i++) {
            reversedArr[i] = arr[len - i - 1];
        }
        return reversedArr;
    }
}
