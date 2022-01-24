package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Balloon {
    int id;
    int value;

    public Balloon(int id, int value) {
        this.id = id;
        this.value = value;
    }
}

public class Silver3_2346 {
    static Deque<Balloon> balloons = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            balloons.offerLast(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        while (true) {
            Balloon balloon = balloons.pollFirst();
            sb.append(balloon.id).append(' ');

            if (balloons.isEmpty()) break;
            moveBalloon(balloon.value);
        }

        System.out.println(sb);
    }

    public static void moveBalloon(int value) {
        if (value > 0) {
            for (int i = 1; i < value; i++) {
                balloons.offerLast(balloons.pollFirst());
            }
        } else {
            for (int i = 0; i < Math.abs(value); i++) {
                balloons.offerFirst(balloons.pollLast());
            }
        }
    }
}
