package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Silver2_9753 {
    static boolean[] primeChecker;
    static ArrayList<Integer> mulPrimes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        setPrimeChecker();
        setMinMulPrimes();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int input = Integer.parseInt(br.readLine());
            for (int mulPrime : mulPrimes) {
                if (input <= mulPrime) {
                    sb.append(mulPrime).append('\n');
                    break;
                }
            }
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[50002];
        Arrays.fill(primeChecker, true);

        for (int i = 2; i * i <= 50001; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= 50001; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static void setMinMulPrimes() {
        mulPrimes = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            if (primeChecker[i]) {
                for (int j = i + 1; j <= 100000 / i + 1; j++) {
                    if (primeChecker[j]) {
                        if (i * j <= 100001) {
                            mulPrimes.add(i * j);
                        }
                    }
                }
            }
        }
        Collections.sort(mulPrimes);
    }
}
