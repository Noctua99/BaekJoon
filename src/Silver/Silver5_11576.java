package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver5_11576 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int baseA = Integer.parseInt(st.nextToken());
        final int baseB = Integer.parseInt(st.nextToken());

        int numOfDigits = Integer.parseInt(br.readLine());

        int num10 = 0;

        st = new StringTokenizer(br.readLine());
        while (numOfDigits-- > 0) {
            num10 += Math.pow(baseA, numOfDigits) * Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        while (num10 > 0) {
            stack.push(num10 % baseB);
            num10 /= baseB;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(' ');
        }

        System.out.println(sb);
    }
}
