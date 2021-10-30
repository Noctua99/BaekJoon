package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver4_4949 {
    static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String testcase;
        while (true) {
            testcase = br.readLine();
            if (testcase.equals(".")) break;

            sb.append(isBalanced(testcase)).append('\n');
        }

        System.out.println(sb);
    }

    public static String isBalanced(String testcase) {
        stack = new Stack<>();

        for (int i = 0; i < testcase.length(); i++) {
            char ch = testcase.charAt(i);

            if (ch == '[' || ch == '(')
                stack.push(ch);

            else if (ch == ']') {
                if (stack.empty() || stack.peek() != '[') return "no";
                else stack.pop();
            } else if (ch == ')') {
                if (stack.empty() || stack.peek() != '(') return "no";
                else stack.pop();
            }


        }
        if (stack.empty()) {
            return "yes";
        }
        return "no";
    }
}
