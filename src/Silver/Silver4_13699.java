package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_13699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(Integer.parseInt(br.readLine())));
    }

    public static long solve(int n) {
        if (n <= 1) return 1;

        long[] arr = new long[n + 1];
        arr[0] = arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i / 2; j++) {
                arr[i] += arr[j] * arr[i - j - 1];
            }
            arr[i] *= 2;
            if (i % 2 == 1) {
                arr[i] += (arr[i / 2] * arr[i / 2]);
            }
        }
        return arr[n];
    }
}
