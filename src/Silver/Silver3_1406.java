package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver3_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();   // 초기에 편집기에 입력되어 있는 문자열
        int M = Integer.parseInt(br.readLine());    // 입력할 명령어의 개수

        Deque<Character> leftDeque = new ArrayDeque<>();
        Stack<Character> rightStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            leftDeque.offerLast(input.charAt(i));
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "L":
                    if (!leftDeque.isEmpty()) {
                        rightStack.push(leftDeque.pollLast());
                    }
                    break;
                case "D":
                    if (!rightStack.isEmpty()) {
                        leftDeque.offerLast(rightStack.pop());
                    }
                    break;
                case "B":
                    if (!leftDeque.isEmpty()) {
                        leftDeque.pollLast();
                    }
                    break;
                case "P":
                    leftDeque.offerLast(st.nextToken().charAt(0));
                    break;
            }
        }

        while (!leftDeque.isEmpty()) {
            sb.append(leftDeque.pollFirst());
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
