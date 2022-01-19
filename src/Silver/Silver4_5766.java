package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver4_5766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        while (!(input = br.readLine()).equals("0 0")) {
            HashMap<Integer, Integer> athletes = new HashMap<>();

            StringTokenizer st = new StringTokenizer(input);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            while (N-- > 0) {
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < M; i++) {
                    int playerNum = Integer.parseInt(st.nextToken());
                    athletes.put(playerNum, athletes.getOrDefault(playerNum, 0) + 1);
                }
            }
            int maxScore = 0;
            for (int score : athletes.values()) {
                maxScore = Math.max(maxScore, score);
            }

            ArrayList<Integer> removeKeys = new ArrayList<>();
            for (int playerNum : athletes.keySet()) {
                if (athletes.get(playerNum) == maxScore) {
                    removeKeys.add(playerNum);
                }
            }

            for (int key : removeKeys) {
                athletes.remove(key);
            }

            ArrayList<Integer> secondNums = new ArrayList<>();
            maxScore = 0;
            for (int score : athletes.values()) {
                maxScore = Math.max(maxScore, score);
            }

            for (int playerNum : athletes.keySet()) {
                if (athletes.get(playerNum) == maxScore) {
                    secondNums.add(playerNum);
                }
            }

            Collections.sort(secondNums);

            for (int secondNum : secondNums) {
                sb.append(secondNum).append(" ");
            }

            sb.append('\n');
        }
        System.out.println(sb);
    }
}
