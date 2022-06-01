package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver4_9843 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfInstructions = Integer.parseInt(br.readLine());

        String[] instructions = new String[numOfInstructions];

        for (int i = 0; i < numOfInstructions; i++) {
            instructions[i] = br.readLine();
        }

        Stack<Integer> stack = new Stack<>();
        int register = Integer.MAX_VALUE;

        loop:
        for (int i = 0; i < numOfInstructions; i++) {
            StringTokenizer st = new StringTokenizer(instructions[i]);
            switch (st.nextToken()) {
                case "PUSH":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "STORE":
                    register = stack.pop();
                    break;
                case "LOAD":
                    stack.push(register);
                    break;
                case "PLUS":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "TIMES":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "IFZERO":
                    if (stack.pop() == 0) {
                        i = Integer.parseInt(st.nextToken()) - 1;
                    }
                    break;
                case "DONE":
                    break loop;
            }
        }

        System.out.println(stack.peek());
    }
}
