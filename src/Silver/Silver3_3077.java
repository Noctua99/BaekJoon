package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver3_3077 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfBattle = Integer.parseInt(br.readLine());

        HashMap<String, Integer> rightAns = new HashMap<>();
        String[] ansSheet = new String[numOfBattle];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfBattle; i++) {
            rightAns.put(st1.nextToken(), i);
            ansSheet[i] = st2.nextToken();
        }

        int score = 0;
        for (int i = 0; i < numOfBattle - 1; i++) {
            for (int j = i + 1; j < numOfBattle; j++) {
                if (rightAns.get(ansSheet[i]) < rightAns.get(ansSheet[j])) {
                    score++;
                }
            }
        }

        System.out.println(score + "/" + numOfBattle * (numOfBattle - 1) / 2);
    }
}
