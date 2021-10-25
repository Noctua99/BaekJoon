package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver1_1456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        int sqrtEnd = (int) Math.sqrt(end);
        boolean[] primeChecker = new boolean[sqrtEnd + 1];
        Arrays.fill(primeChecker, true);

        for (int i = 2; i * i <= sqrtEnd; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= sqrtEnd; j += i) {
                    primeChecker[j] = false;
                }
            }
        }

        int count = 0;
        long almostPrime;
        for (int i = 2; i <= sqrtEnd; i++) {
            if (primeChecker[i]) {
                almostPrime = i;
                while (almostPrime <= end / i) {
                    almostPrime *= i;
                    if (almostPrime >= start) count++;
                }
            }
        }
        System.out.println(count);
    }
}
