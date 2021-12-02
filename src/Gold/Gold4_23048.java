package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold4_23048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] paintNumber = new int[N + 1];
        paintNumber[1] = 1;
        int count = 1;
        for (int i = 2; i <= N; i++) {
            if (paintNumber[i] == 0) {
                count++;
                for (int j = i; j <= N; j += i) {
                    paintNumber[j] = count;
                }
            }
        }
        sb.append(count).append('\n');
        for (int i = 1; i <= N; i++) {
            sb.append(paintNumber[i]).append(" ");
        }
        sb.append('\n');
        System.out.println(sb);
    }
}
