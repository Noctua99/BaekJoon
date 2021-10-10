package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver4_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] primeNumber = new boolean[n + 1];
        Arrays.fill(primeNumber, true);

        int count = 0;

        Loop1:
        for (int j = 2; j <= n; j++) {
            Loop2:
            for (int l = j; l <= n; l += j) {
                if (primeNumber[l]) {
                    primeNumber[l] = false;
                    count++;
                    if (count == k) {
                        System.out.println(l);
                        break Loop1;
                    }
                }
            }
        }
    }
}
