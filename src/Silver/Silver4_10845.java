package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Silver4_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testAmount = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int loop = 0; loop < testAmount; loop++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    queue.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(queue.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty())
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "front":
                    if (queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(queue.peekLast()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(queue.peekFirst()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
