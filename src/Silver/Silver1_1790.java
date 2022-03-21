package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_1790 {

    public static int solve(int n, int k) {
        int[] tens = new int[9];
        for (int i = 1; i <= 8; i++) {
            tens[i] = (int) Math.pow(10, i);
        }

        int len = 1;
        for (int i = 1; i <= n; i++) {
            if (i == tens[len]) {
                len++;
            }
            k -= len;
            if (k <= 0) {
                return String.valueOf(i).charAt(len + k - 1) - '0';
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(solve(N, k));
    }
}
