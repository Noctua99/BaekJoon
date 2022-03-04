package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1094 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(Integer.parseInt(br.readLine())));
    }

    public static int solve(int X) {
        int[] numbers = new int[]{64, 32, 16, 8, 4, 2, 1};
        int count = 0;

        for (int number : numbers) {
            if (X >= number) {
                X -= number;
                count++;
            }

            if (X == 0) break;
        }

        return count;
    }
}
