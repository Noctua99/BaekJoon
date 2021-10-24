package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Silver1_9020 {
    public static void main(String[] args) throws IOException {
        boolean[] primeChecker = new boolean[10001];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;
        for (int i = 2; i * i <= 10000; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= 10000; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
        ArrayList<Integer> primeNumber = new ArrayList<>();
        for (int i = 3; i <= 10000; i++) {
            if (primeChecker[i]) {
                primeNumber.add(i);
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testAmount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int loop = 0; loop < testAmount; loop++) {
            int testcase = Integer.parseInt(br.readLine());
            if (primeChecker[testcase / 2]) {
                sb.append(testcase / 2).append(" ").append(testcase / 2).append("\n");
            } else {
                int smallPrime = 0;
                int largePrime = 0;
                for (int prime : primeNumber) {
                    if (prime >= testcase / 2) break;
                    if ((primeChecker[testcase - prime])) {
                        smallPrime = prime;
                        largePrime = testcase - prime;
                    }
                }
                sb.append(smallPrime).append(" ").append(largePrime).append("\n");
            }
        }
        System.out.println(sb);
    }
}
