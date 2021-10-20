package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();

        int[] numberChecker = new int[10];
        for (int i = 0; i < roomNumber.length(); i++) {
            numberChecker[roomNumber.charAt(i) - '0']++;
        }
        numberChecker[9] = numberChecker[6] = (int) Math.ceil((numberChecker[9] + numberChecker[6]) / 2.0);
        int maxNumber = numberChecker[9];
        for (int i = 0; i < 9; i++) {
            maxNumber = Math.max(numberChecker[i], maxNumber);
        }
        System.out.println(maxNumber);
    }
}
