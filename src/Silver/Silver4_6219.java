package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver4_6219 {
    static boolean[] primeChecker;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        setPrimeChecker(B);

        int count = 0;

        for (int i = A; i <= B; i++) {
            if (primeChecker[i]) {
                String temp = String.valueOf(i);
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) - '0' == D) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void setPrimeChecker(int N) {
        primeChecker = new boolean[N + 1];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= N; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }
}
