package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1037 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfRealDivisor = Integer.parseInt(br.readLine());
        int minDivisor = Integer.MAX_VALUE;
        int maxDivisor = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (numOfRealDivisor-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            minDivisor = Math.min(num, minDivisor);
            maxDivisor = Math.max(num, maxDivisor);
        }

        System.out.println(minDivisor * maxDivisor);
    }
}
