package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold4_1630 {

    static int N;
    static boolean[] isPrime;
    static final long MOD = 987_654_321;

    public static int solve() {

        long ans = 1;

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                long j = i;
                while (j * i <= N) {
                    j *= i;
                }
                ans = (ans * j) % MOD;
            }
        }

        return (int) ans;
    }

    public static void setIsPrime() {

        isPrime = new boolean[N + 1];

        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        setIsPrime();

        System.out.println(solve());
    }
}
