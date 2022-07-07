package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold4_17162 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int queryCount = Integer.parseInt(st.nextToken());
        final int mod = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        Stack<Integer>[] indexes = new Stack[mod];

        for (int i = 0; i < mod; i++) {
            indexes[i] = new Stack<>();
        }

        while (queryCount-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                int remainder = Integer.parseInt(st.nextToken()) % mod;
                indexes[remainder].push(stack.size());
                stack.push(remainder);
            } else if (command == 2) {
                if (!stack.isEmpty()) {
                    indexes[stack.peek()].pop();
                    stack.pop();
                }
            } else {
                int minCount = stack.size();
                boolean check = true;

                for (Stack<Integer> tempStack : indexes) {
                    if (tempStack.isEmpty()) {
                        sb.append(-1).append('\n');
                        check = false;
                        break;
                    }
                    minCount = Math.min(tempStack.peek(), minCount);
                }

                if (check) {
                    sb.append(stack.size() - minCount).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}
