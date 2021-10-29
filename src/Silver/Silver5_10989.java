package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver5_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testAmount = Integer.parseInt(br.readLine());
        int[] testcase = new int[testAmount];
        for (int t = 0; t < testAmount; t++) {
            testcase[t] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(testcase);

        StringBuilder sb = new StringBuilder();
        for (int data : testcase) {
            sb.append(data).append('\n');
        }
        System.out.print(sb);
    }
}
