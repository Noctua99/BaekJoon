package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numOfCD1 = Integer.parseInt(st.nextToken());    // 상근이가 가지고 있는 CD의 수
            int numOfCD2 = Integer.parseInt(st.nextToken());    // 선영이가 가지고 있는 CD의 수

            if (numOfCD1 == 0) break;

            int[] CD1 = new int[numOfCD1];

            for (int i = 0; i < numOfCD1; i++) {
                CD1[i] = Integer.parseInt(br.readLine());
            }

            int count = 0;
            for (int i = 0; i < numOfCD2; i++) {
                if (Arrays.binarySearch(CD1, Integer.parseInt(br.readLine())) >= 0) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
