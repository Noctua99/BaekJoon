package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_1500 {

    public static long findMaxProduct(int S, int K) {
        int quotient = S / K;
        int remainder = S % K;

        return (long) (Math.pow(quotient, K - remainder) * Math.pow(quotient + 1, remainder));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(findMaxProduct(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
        ));
    }
}
