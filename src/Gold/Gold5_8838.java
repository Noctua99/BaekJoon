package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold5_8838 {

    static Stack<Integer> lowerEnemies = new Stack<>();
    static PriorityQueue<Integer> ceilEnemies = new PriorityQueue<>();
    static int currentPower;
    static int strongestPower;

    public static int findMinRoundCount() {
        int roundCount = 1;

        while (currentPower <= strongestPower) {
            while (!ceilEnemies.isEmpty() && currentPower > ceilEnemies.peek()) {
                lowerEnemies.push(ceilEnemies.poll());
            }

            if (lowerEnemies.isEmpty()) {
                return -1;
            }

            currentPower += lowerEnemies.pop();
            roundCount++;
        }

        return roundCount;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCount = Integer.parseInt(br.readLine());

        while (testCount-- > 0) {
            lowerEnemies.clear();
            ceilEnemies.clear();
            strongestPower = Integer.MIN_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine());
            currentPower = Integer.parseInt(st.nextToken());
            int enemyCount = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            while (enemyCount-- > 0) {
                int enemyPower = Integer.parseInt(st.nextToken());
                ceilEnemies.offer(enemyPower);
                strongestPower = Math.max(enemyPower, strongestPower);
            }

            int minRoundCount = findMinRoundCount();

            sb.append(minRoundCount != -1 ? minRoundCount : "NIE").append('\n');
        }

        System.out.println(sb);
    }
}
