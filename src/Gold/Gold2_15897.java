package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold2_15897 {

    public static long findNumOfRuns(int n) {
        if (n == 1) return 1;

        long numOfRuns = n;

        for (int i = 2; i < n; ) {
            int temp = (n - 1) / i;
            int value = (n - 1) / temp;

            numOfRuns += (long) (temp + 1) * (value - i + 1);
            i = value + 1;
        }

        return numOfRuns + 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findNumOfRuns(Integer.parseInt(br.readLine())));
    }
}
