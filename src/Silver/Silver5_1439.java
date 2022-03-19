package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1439 {

    public static int solve(String input) {

        int zeroCount = 0;
        int oneCount = 0;

        if (input.charAt(0) == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                if (input.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
        }

        return Math.min(zeroCount, oneCount);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(br.readLine()));
    }
}
