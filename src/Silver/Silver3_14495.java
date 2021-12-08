package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_14495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N <= 3) {
            System.out.println(1);
        } else {
            long[] similarFibo = new long[N + 1];
            similarFibo[1] = 1;
            similarFibo[2] = 1;
            similarFibo[3] = 1;
            for (int i = 4; i <= N; i++) {
                similarFibo[i] = similarFibo[i - 1] + similarFibo[i - 3];
            }
            System.out.println(similarFibo[N]);
        }
    }
}
