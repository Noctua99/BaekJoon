package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Silver1_9711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        BigInteger[] fibo = new BigInteger[10001];
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;
        for (int i = 2; i <= 10000; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            BigInteger Q = new BigInteger(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(fibo[P].mod(Q)).append('\n');
        }
        System.out.println(sb);
    }
}
