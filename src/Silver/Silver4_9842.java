package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Silver4_9842 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        int maxNum = 104729;

        boolean[] primeChecker = new boolean[maxNum + 1];
        Arrays.fill(primeChecker, true);
        for (int i = 2; i * i <= maxNum; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= maxNum; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= maxNum; i++) {
            if (primeChecker[i]) {
                count++;
                if (count == testcase) {
                    System.out.println(i);
                }
            }
        }
    }
}
