package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold3_13904 {

    static class Task {
        final int remainingDays;
        final int score;

        Task(int remainingDays, int score) {
            this.remainingDays = remainingDays;
            this.score = score;
        }
    }

    static Task[] tasks;
    static PriorityQueue<Integer> scores = new PriorityQueue<>();

    public static int findMaxScore() {
        int maxScore = 0;

        scores.offer(tasks[0].score);

        for (int i = 1; i < tasks.length; i++) {
            Task tempTask = tasks[i];
            if (tempTask.remainingDays > scores.size()) {
                scores.offer(tempTask.score);
            } else {
                if (tempTask.score > scores.peek()) {
                    scores.poll();
                    scores.offer(tempTask.score);
                }
            }
        }

        for (Integer score : scores) {
            maxScore += score;
        }

        return maxScore;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfTasks = Integer.parseInt(br.readLine());

        tasks = new Task[numOfTasks];

        // set tempTasks
        for (int i = 0; i < numOfTasks; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            tasks[i] = new Task(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(tasks, Comparator.comparingInt(o -> o.remainingDays));

        System.out.println(findMaxScore());
    }
}
