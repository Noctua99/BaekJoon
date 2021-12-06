package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver2_11423 {
    static boolean[] primeChecker;
    static int[] primeCounter;
    static final int MAX = 10_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        setPrimeChecker();
        setPrimeCounter();

        String input = "";
        while ((input = br.readLine()) != null) {
            br.readLine();
            st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(primeCounter[b] - primeCounter[a - 1]).append('\n').append('\n');
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[MAX + 1];
        Arrays.fill(primeChecker, true);
        for (int i = 2; i * i <= MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static void setPrimeCounter() {
        primeCounter = new int[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            if (primeChecker[i]) {
                primeCounter[i] = primeCounter[i - 1] + 1;
            } else {
                primeCounter[i] = primeCounter[i - 1];
            }
        }
    }
}
