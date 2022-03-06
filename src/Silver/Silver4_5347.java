package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_5347 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            result.append(lcm(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            )).append('\n');
        }

        System.out.println(result);
    }

    public static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
