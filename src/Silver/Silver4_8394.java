package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_8394 {

    public static int findNumOfWays(int n) {
        if (n <= 2) return n;

        int a = 1;
        int b = 2;
        for (int i = 0; i < n - 2; i++) {
            int temp = b;
            b = (a + b) % 10;
            a = temp;
        }

        return b;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findNumOfWays(Integer.parseInt(br.readLine())));
    }
}
