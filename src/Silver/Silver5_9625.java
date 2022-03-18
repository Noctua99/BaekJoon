package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_9625 {

    public static String solve(int n) {
        int countA = 0;
        int countB = 1;

        while (n-- > 1) {
            int temp = countA;
            countA = countB;
            countB += temp;
        }

        return countA + " " + countB;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(Integer.parseInt(br.readLine())));
    }
}
