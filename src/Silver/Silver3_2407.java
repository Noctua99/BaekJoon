package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Silver3_2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        BigInteger[] factorials = new BigInteger[N + 1];
        factorials[0] = new BigInteger("1");

        for (int i = 1; i <= N; i++) {
            factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i));
        }

        BigInteger result = factorials[N].divide(factorials[M]).divide(factorials[N - M]);
        System.out.println(result);
    }
}