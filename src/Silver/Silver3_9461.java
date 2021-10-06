package Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Silver3_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        long[] padovan = new long[100];
        padovan[0] = 1;
        padovan[1] = 1;
        padovan[2] = 1;
        padovan[3] = 2;
        padovan[4] = 2;

        for (int i = 5; i < 100; i++) {
            padovan[i] = padovan[i - 5] + padovan[i - 1];
        }

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(padovan[n - 1]).append('\n');
        }
        bw.write(String.valueOf(sb));


        // List를 사용하여 푸는 방법

        /*List<Long> padovan = new ArrayList<>(Arrays.asList(1L, 1L, 1L, 2L, 2L));

        for (int j = 5; j < 100; j++) {
            padovan.add(padovan.get(j - 5) + padovan.get(j - 1));
        }

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(padovan.get(n - 1) + "\n");
        }*/

        bw.flush();
        bw.close();
    }
}
