package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver1_5636 {
    static boolean[] primeChecker;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        setPrimeChecker();

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;

            sb.append(findMaxPrime(input)).append('\n');
        }

        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[100001];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;

        for (int i = 2; i * i <= 100000; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static int findMaxPrime(String input) {
        int max = 0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j <= input.length() - i; j++) {
                int subString = Integer.parseInt(input.substring(j, j + i));
                if (primeChecker[subString]) {
                    max = Math.max(subString, max);
                }
            }
            if (max != 0) break;
        }
        return max;
    }
}
