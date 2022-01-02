package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Gold5_20157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<HashMap<Integer, Integer>, Integer> quadrant = new HashMap<>();

        int numOfBalloons = Integer.parseInt(br.readLine());
        while (numOfBalloons-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());


            HashMap<Integer, Integer> innerMap = new HashMap<>();
            int gcdXY = Math.abs(gcd(x, y));
            System.out.println(gcdXY);
            x = x / gcdXY;
            y = y / gcdXY;
            System.out.println(x + " " + y);

            innerMap.put(x, y);
            quadrant.put(innerMap, quadrant.getOrDefault(innerMap, 0) + 1);
        }

        int maxScore = Integer.MIN_VALUE;
        for (int score : quadrant.values()) {
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
