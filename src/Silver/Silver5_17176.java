package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_17176 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[53];
        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (size-- > 0) {
            numbers[Integer.parseInt(st.nextToken())]++;
        }

        System.out.println(solve(numbers, br.readLine()));
    }

    public static String solve(int[] numbers, String input) {
        for (int i = 0; i < input.length(); i++) {
            if (numbers[covertToInt(input.charAt(i))] > 0) {
                numbers[covertToInt(input.charAt(i))]--;
            } else {
                return "n";
            }
        }

        return "y";
    }

    public static int covertToInt(Character ch) {
        if (ch == ' ') {
            return 0;
        } else if (ch <= 'Z') {
            return ch - 64;
        }

        return ch - 70;
    }
}
