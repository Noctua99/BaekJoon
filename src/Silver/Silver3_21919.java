package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver3_21919 {
    public static void main(String[] args) throws IOException {
        boolean[] primeNumber = new boolean[1000001];
        Arrays.fill(primeNumber, true);
        for (int i = 2; i * i <= 1000000; i++) {
            if (primeNumber[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    primeNumber[j] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());


        long sum = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < testcase; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (primeNumber[input]) {
                primeNumber[input] = false;
                sum *= input;
            }
        }
        if (sum == 1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
    }
}
