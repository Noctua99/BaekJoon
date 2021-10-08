package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold4_10859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long testdata = Long.parseLong(br.readLine());

        if (testdata == 1) {
            System.out.println("no");
        } else if (testdata == 2) {
            System.out.println("yes");
        } else {
            if (isNumber(testdata) && isPrimeNumber(testdata) && isPrimeNumberInReversed(testdata)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isNumber(long num) {  // num에 3, 4, 7이 포함되어 있으면 false를 return
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '7') {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(long num) {     // num이 소수가 아니면 false를 return
        for (int i = 2; (long) i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumberInReversed(long num) {   // num을 주어진 규칙에 따라 뒤집고 소수가 아니면 false를 return
        long reverse = 0;
        long remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            if (remainder == 9L) {
                remainder = 6L;
            } else if (remainder == 6L) {
                remainder = 9L;
            }
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        return isPrimeNumber(reverse);
    }
}
