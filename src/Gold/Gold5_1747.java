package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Gold5_1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (input > 98689) {
            System.out.println(1003001);
        } else {
            boolean[] primeNumber = new boolean[98690];
            Arrays.fill(primeNumber, true);
            for (int i = 2; i * i <= 98689; i++) {
                if (primeNumber[i]) {
                    for (int j = i * i; j <= 98689; j += i) {
                        primeNumber[j] = false;
                    }
                }
            }

            ArrayList<Integer> palindromePrime = new ArrayList<>();

            for (int i = 2; i <= 98689; i++) {
                if (primeNumber[i]) {
                    String temp = String.valueOf(i);
                    if (temp.equals(new StringBuilder(temp).reverse().toString())) {
                        palindromePrime.add(i);
                    }
                }
            }
            for (int data : palindromePrime) {
                if (data >= input) {
                    System.out.println(data);
                    break;
                }
            }
        }
    }
}
