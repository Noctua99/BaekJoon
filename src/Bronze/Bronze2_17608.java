package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bronze2_17608 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            stack.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        int max = Integer.MIN_VALUE;

        while (!stack.isEmpty()) {
            int num = stack.pop();

            if (num > max) {
                count++;
                max = num;
            }
        }

        System.out.println(count);
    }
}
