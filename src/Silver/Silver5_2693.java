package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTest = Integer.parseInt(br.readLine());
        while (numOfTest-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] numbers = new int[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(numbers);

            sb.append(numbers[7]).append('\n');
        }

        System.out.println(sb);
    }
}
