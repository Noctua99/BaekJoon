package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold5_17178 {

    static int[] line;
    static PriorityQueue<Integer> sequences = new PriorityQueue<>();
    static Stack<Integer> waitingStack = new Stack<>();

    public static boolean isPossible() {
        for (int i = 0; i < line.length; i++) {
            if (line[i] == sequences.peek()) {
                sequences.poll();
            } else {
                if (!waitingStack.isEmpty() && (int) waitingStack.peek() == sequences.peek()) {
                    waitingStack.pop();
                    sequences.poll();
                    i--;
                } else {
                    waitingStack.push(line[i]);
                }
            }
        }

        while (!sequences.isEmpty()) {
            if ((int) waitingStack.pop() != sequences.poll()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lineNum = Integer.parseInt(br.readLine());

        line = new int[lineNum * 5];

        // set line, sequence
        for (int i = 0; i < lineNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                StringTokenizer st1 = new StringTokenizer(st.nextToken(), "-");
                int ticketID = st1.nextToken().charAt(0) * 1000 + Integer.parseInt(st1.nextToken());
                line[i * 5 + j] = ticketID;
                sequences.offer(ticketID);
            }
        }

        System.out.println(isPossible() ? "GOOD" : "BAD");
    }
}
