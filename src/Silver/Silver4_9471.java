package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_9471 {

    static int[] fibo = new int[500_001];

    public static int findPisanoPeriods(int mod) {
        for (int i = 3; i <= 500_000; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % mod;

            if (fibo[i] == 1 && fibo[i - 1] == 1) {
                return i - 2;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        fibo[1] = fibo[2] = 1;

        int dataSetsNum = Integer.parseInt(br.readLine());
        while (dataSetsNum-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken()).append(' ')
                    .append(findPisanoPeriods(Integer.parseInt(st.nextToken())))
                    .append('\n');
        }

        System.out.println(sb);
    }
}
