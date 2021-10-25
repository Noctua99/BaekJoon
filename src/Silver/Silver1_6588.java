package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Silver1_6588 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        boolean[] primeChecker = new boolean[MAX + 1];
        Arrays.fill(primeChecker, true);
        for (int i = 2; i * i <= MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
        ArrayList<Integer> primeNumber = new ArrayList<>();
        for (int i = 3; i <= MAX; i++) {
            if (primeChecker[i]) {
                primeNumber.add(i);
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());
        while (testcase != 0) {
            for (int data : primeNumber) {
                if (primeChecker[testcase - data]) {
                    sb.append(testcase).append(" = ").append(data).append(" + ").append(testcase - data).append("\n");
                    break;
                }
            }
            testcase = Integer.parseInt(br.readLine());
        }
        System.out.print(sb);
    }
}
