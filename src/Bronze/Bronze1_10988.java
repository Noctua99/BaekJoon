package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1_10988 {

    public static boolean isPalindrome(String input) {
        int len = input.length();

        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isPalindrome(br.readLine()) ? 1 : 0);
    }
}
