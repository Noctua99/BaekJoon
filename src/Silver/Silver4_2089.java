package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            sb.append(0);
        }
        while (N != 0) {
            sb.append(Math.abs(N % -2));
            N = (int) Math.ceil(N / -2.0);
        }

        System.out.println(sb.reverse());
    }
}
