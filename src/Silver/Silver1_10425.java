package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

public class Silver1_10425 {
    static final int MAX = 100_000;
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> fiboMap = new HashMap<>();
        int[] fibo = new int[MAX + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= MAX; i++) {
            fibo[i] = (fibo[i - 1] % MOD + fibo[i - 2] % MOD) % MOD;
        }

        for (int i = 0; i <= MAX; i++) {
            fiboMap.put(fibo[i], i);
        }

        int T = Integer.parseInt(br.readLine());
        BigInteger bigIntMOD = BigInteger.valueOf(MOD);
        while (T-- > 0) {
            BigInteger input = new BigInteger(br.readLine());
            sb.append(fiboMap.get(Integer.valueOf(String.valueOf(input.mod(bigIntMOD))))).append('\n');
        }
        System.out.println(sb);
    }
}
