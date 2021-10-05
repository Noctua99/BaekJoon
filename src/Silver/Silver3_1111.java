package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class Silver3_1111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long lcm = a * b / gcd(a, b);
        bw.write(lcm + "\n");
        bw.flush();
        bw.close();
    }

    public static long gcd(long a, long b) {
        long temp = 0;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
