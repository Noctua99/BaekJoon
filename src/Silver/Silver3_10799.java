package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver3_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        String input = br.readLine();
        int totalCount = 0;  // 잘려진 조각의 총 개수
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (input.charAt(i - 1) == '(') {
                    stack.pop();
                    totalCount += stack.size();
                } else {
                    stack.pop();
                    totalCount++;
                }
            }
        }
        System.out.println(totalCount);
    }
}
