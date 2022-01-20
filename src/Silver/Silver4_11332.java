package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_11332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            if (isMayPass(br.readLine())) {
                sb.append("May Pass.\n");
            } else {
                sb.append("TLE!\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isMayPass(String input) {
        StringTokenizer st = new StringTokenizer(input);
        String timeComplexity = st.nextToken();
        int inputMax = Integer.parseInt(st.nextToken());
        int numOfTests = Integer.parseInt(st.nextToken());
        int timeLimit = Integer.parseInt(st.nextToken());

        switch (timeComplexity) {
            case "O(N)":
                return inputMax * numOfTests <= timeLimit * 100_000_000;
            case "O(N^2)":
                return Math.pow(inputMax, 2) * numOfTests <= timeLimit * 100_000_000;
            case "O(N^3)":
                return Math.pow(inputMax, 3) * numOfTests <= timeLimit * 100_000_000;
            case "O(2^N)":
                return Math.pow(2, inputMax) * numOfTests <= timeLimit * 100_000_000;
            case "O(N!)":
                if (inputMax >= 13) return false;
                return factorial(inputMax) * numOfTests <= timeLimit * 100_000_000L;
        }
        return true;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
