package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver4_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 단어의 수
        int count = 0;  // 좋은 단어의 수

        while (N-- > 0) {
            if (isGoodWord(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isGoodWord(String input) {
        Stack<Character> stack = new Stack<>();
        int len = input.length();
        if (len % 2 == 1) {
            return false;
        } else {
            for (int i = 0; i < len; i++) {
                char ch = input.charAt(i);
                if (stack.isEmpty() || ch != stack.peek()) {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }
}
