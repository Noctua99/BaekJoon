package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold4_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[N];

        Stack<Integer> stack = new Stack<>();
        for (int i = N - 1; i >= 0; i--) {
            while (true) {
                if (stack.isEmpty()) {
                    result[i] = -1;
                    stack.push(arr[i]);
                    break;
                }
                if (arr[i] >= stack.peek()) {
                    stack.pop();
                } else {
                    result[i] = stack.peek();
                    stack.push(arr[i]);
                    break;
                }
            }
        }

        for (int data : result) {
            sb.append(data).append(" ");
        }

        System.out.println(sb);
    }
}
