package Silver;

import java.io.*;

public class Silver2_1788 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if (n > 0) {
            sb.append(1).append('\n');
        } else if (n < 0) {
            n = Math.abs(n);
            if (n % 2 == 0) {
                sb.append(-1).append('\n');
            } else {
                sb.append(1).append('\n');
            }
        } else {
            sb.append(0).append('\n');
        }
        sb.append(fibo(n)).append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int fibo(int num) {
        if (num <= 1) {
            return num;
        } else {
            int[] fiboArray = new int[num + 1];
            fiboArray[0] = 0;
            fiboArray[1] = 1;
            for (int i = 2; i <= num; i++) {
                fiboArray[i] = (fiboArray[i - 1] + fiboArray[i - 2]) % 1000000000;
            }
            return fiboArray[num];
        }
    }
}
