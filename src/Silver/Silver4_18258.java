package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Silver4_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    // 주어지는 명령의 수

        Deque<String> deque = new ArrayDeque<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    deque.offer(st.nextToken());
                    break;
                case "pop":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.poll());
                    }
                    sb.append('\n');
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append('\n');
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.peekFirst());
                    }
                    sb.append('\n');
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.peekLast());
                    }
                    sb.append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
