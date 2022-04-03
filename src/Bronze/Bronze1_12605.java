package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bronze1_12605 {

    public static String reverseBySpace(String word) {
        StringTokenizer st = new StringTokenizer(word);
        Stack<String> stack = new Stack<>();

        while (st.hasMoreTokens()) {
            stack.add(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(' ');
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testNum; i++) {
            sb.append("Case #").append(i).append(": ").append(reverseBySpace(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }
}
