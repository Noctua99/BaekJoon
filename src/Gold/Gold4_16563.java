package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold4_16563 {
    static int MAX = 5000000;

    public static void main(String[] args) throws IOException {
        boolean[] primeChecker = new boolean[5000001];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = false;
        primeChecker[1] = false;
        for (int i = 2; i * i <= 5000000; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= 5000000; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
        ArrayList<Integer> primeNumber = new ArrayList<>();
        for (int i = 2; i <= 5000000; i++) {
            if (primeChecker[i]) {
                primeNumber.add(i);
            }
        }

        int[] minPrimeFactor = new int[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            if (primeChecker[i]) {
                minPrimeFactor[i] = i;
            } else {
                for (int prime : primeNumber) {
                    if (i % prime == 0) {
                        minPrimeFactor[i] = prime;
                        break;
                    }
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numAmount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numAmount; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (num != 1) {
                sb.append(minPrimeFactor[num]).append(" ");
                num /= minPrimeFactor[num];
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
