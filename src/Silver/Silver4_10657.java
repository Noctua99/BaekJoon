package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver4_10657 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> cowStack = new Stack<>();

        int numOfCow = Integer.parseInt(br.readLine());
        while (numOfCow-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int speed = Integer.parseInt(st.nextToken());
            while (!cowStack.isEmpty() && cowStack.peek() > speed) {
                cowStack.pop();
            }
            cowStack.push(speed);
        }

        System.out.println(cowStack.size());
    }
}
