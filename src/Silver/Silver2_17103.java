package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver2_17103 {
    static final int MAX = 1000000;
    public static void main(String[] args) throws IOException {
        boolean[] primeChecker = new boolean[MAX + 1];
        Arrays.fill(primeChecker, true);

        primeChecker[0] = primeChecker[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
        int[] primeNumber = new int[78498];
        int index = 0;
        for (int i = 2; i <= MAX; i++) {
            if (primeChecker[i]) {
                primeNumber[index] = i;
                index++;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testAmount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int loop = 0; loop < testAmount; loop++) {
            int testcase = Integer.parseInt(br.readLine());
            int count = 0;

            for (int data : primeNumber) {
                if (data > testcase / 2) break;
                if (primeChecker[testcase - data]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
