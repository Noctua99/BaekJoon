package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Task {
    int score;
    int time;

    public Task(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class Silver4_17952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Task> tasks = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalTime = Integer.parseInt(st.nextToken());
        int totalScore = 0;

        while (totalTime-- > 0) {
            st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("1")) {
                int score = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                if (time == 1) {
                    totalScore += score;
                    continue;
                }
                tasks.push(new Task(score, time - 1));
            } else {
                if (tasks.isEmpty()) {
                    continue;
                }

                if (tasks.peek().time == 1) {
                    totalScore += tasks.pop().score;
                } else {
                    tasks.peek().time--;
                }
            }
        }

        System.out.println(totalScore);
    }
}
