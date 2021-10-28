package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testAmount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < testAmount; t++) {
            if (isVPS(br.readLine())) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }

    public static boolean isVPS(String testcase) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < testcase.length(); i++) {
            if (testcase.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
