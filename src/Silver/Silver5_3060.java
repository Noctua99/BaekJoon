package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_3060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            int dailyAmount = Integer.parseInt(br.readLine());
            int day = 1;
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 6; i++) {
                sum += Integer.parseInt(st.nextToken());
            }

            while (sum <= dailyAmount) {
                sum *= 4;
                day++;
            }
            sb.append(day).append('\n');
        }

        System.out.println(sb);
    }
}
