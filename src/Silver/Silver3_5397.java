package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Silver3_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        Deque<Character> leftDeque;
        Stack<Character> rightStack;

        while (T-- > 0) {
            String input = br.readLine();

            leftDeque = new ArrayDeque<>();
            rightStack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '<') {
                    if (!leftDeque.isEmpty()) {
                        rightStack.push(leftDeque.pollLast());
                    }
                } else if (input.charAt(i) == '>') {
                    if (!rightStack.isEmpty()) {
                        leftDeque.offerLast(rightStack.pop());
                    }
                } else if (input.charAt(i) == '-') {
                    if (!leftDeque.isEmpty()) {
                        leftDeque.pollLast();
                    }
                } else {
                    leftDeque.offerLast(input.charAt(i));
                }
            }

            while (!leftDeque.isEmpty()) {
                sb.append(leftDeque.pollFirst());
            }

            while (!rightStack.isEmpty()) {
                sb.append(rightStack.pop());
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
