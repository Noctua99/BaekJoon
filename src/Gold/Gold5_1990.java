package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold5_1990 {
    static boolean[] primeNumber = new boolean[100000001];

    public static void main(String[] args) throws IOException {
        Arrays.fill(primeNumber, true);
        for (int i = 2; i * i <= 100000000; i++) {
            if (primeNumber[i]) {
                for (int j = i * i; j <= 100000000; j += i) {
                    primeNumber[j] = false;
                }
            }
        }

        StringBuilder sb;
        for (int i = 2; i <= 100000000; i++) {
            if (primeNumber[i]) {
                String temp = String.valueOf(i);
                sb = new StringBuilder(temp);
                if (!temp.equals(sb.reverse().toString())) {
                    primeNumber[i] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (primeNumber[i]) {
                sb.append(i).append('\n');
            }
        }
        sb.append(-1);
        System.out.println(sb);
    }
}