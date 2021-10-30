package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Silver4_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x;
            switch (command) {
                case "push_front":
                    x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;
                case "push_back":
                    x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.removeFirst()).append('\n');
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.removeLast()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.getFirst()).append('\n');
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.getLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}
