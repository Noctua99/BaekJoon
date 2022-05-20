package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold2_1781 {

    static class Problem {
        final int deadLine;
        final int reward;

        public Problem(int deadLine, int reward) {
            this.deadLine = deadLine;
            this.reward = reward;
        }
    }

    static Problem[] problems;
    static PriorityQueue<Integer> rewards = new PriorityQueue<>();

    public static int findMaxReward() {
        int maxReward = 0;

        rewards.offer(problems[0].reward);

        for (int i = 1; i < problems.length; i++) {
            if (problems[i].deadLine > rewards.size()) {
                rewards.offer(problems[i].reward);
            } else {
                if (problems[i].reward > rewards.peek()) {
                    rewards.poll();
                    rewards.offer(problems[i].reward);
                }
            }
        }

        for (int reward : rewards) {
            maxReward += reward;
        }

        return maxReward;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfProblems = Integer.parseInt(br.readLine());

        problems = new Problem[numOfProblems];

        for (int i = 0; i < numOfProblems; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            problems[i] = new Problem(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(problems, Comparator.comparingInt(o -> o.deadLine));

        System.out.println(findMaxReward());
    }
}
