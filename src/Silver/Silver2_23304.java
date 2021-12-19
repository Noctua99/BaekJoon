package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2_23304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if (isAKARAKAPalindrome(input)) {
            System.out.println("AKARAKA");
        } else {
            System.out.println("IPSELENTI");
        }
    }

    public static boolean isAKARAKAPalindrome(String str) {
        int len = str.length();
        if (len == 1) {
            return true;
        }
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        if (len % 2 == 0) {
            return isAKARAKAPalindrome(str.substring(0, len / 2)) && isAKARAKAPalindrome(str.substring(len / 2, len));
        } else {
            return isAKARAKAPalindrome(str.substring(0, len / 2)) && isAKARAKAPalindrome(str.substring(len / 2 + 1, len));
        }
    }
}
