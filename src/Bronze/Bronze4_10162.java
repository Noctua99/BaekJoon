package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze4_10162 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] timers = {300, 60, 10};

        if (T % 10 != 0) {
            sb.append(-1);
        } else {
            for (int timer : timers) {
                if (T >= timer) {
                    sb.append(T / timer).append(' ');
                } else {
                    sb.append(0).append(' ');
                }

                T %= timer;
            }
        }

        System.out.println(sb);
    }
}
