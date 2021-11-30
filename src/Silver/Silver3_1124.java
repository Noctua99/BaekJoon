package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver3_1124 {
    static boolean[] primeChecker;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        setPrimeChecker(B);

        int underPrimeCount = 0;
        for (int i = A; i <= B; i++) {
            int num = i;
            int count = 0;
            while (num != 1) {
                for (int j = 2; j <= num; j++) {
                    if (primeChecker[j]) {
                        if (num % j == 0) {
                            num /= j;
                            count++;
                            break;
                        }
                    }
                }
            }
            if (primeChecker[count]) {
                underPrimeCount++;
            }
        }
        System.out.println(underPrimeCount);
    }

    public static void setPrimeChecker(int B) {
        primeChecker = new boolean[B + 1];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;

        for (int i = 2; i * i <= B; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= B; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }
}
