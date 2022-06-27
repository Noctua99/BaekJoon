package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1418 {

    public static int solve(int n, int k) {
        int[] maxPrimeFactor = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (maxPrimeFactor[i] == 0) {
                for (int j = i; j <= n; j += i) {
                    maxPrimeFactor[j] = i;
                }
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (maxPrimeFactor[i] <= k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
    }
}
