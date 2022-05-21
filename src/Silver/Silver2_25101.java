package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver2_25101 {

    static class theRich {
        final int index;
        int wealth;

        public theRich(int index, int wealth) {
            this.index = index;
            this.wealth = wealth;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<theRich> theRiches = new PriorityQueue<>((o1, o2) -> {
            if (o1.wealth == o2.wealth) {
                return o1.index - o2.index;
            }
            return o2.wealth - o1.wealth;
        });

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfTheRich = Integer.parseInt(st.nextToken());
        int numOfHeists = Integer.parseInt(st.nextToken());

        int[] wealth = new int[numOfTheRich];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfTheRich; i++) {
            wealth[i] = Integer.parseInt(st.nextToken());
            theRiches.offer(new theRich(
                    i, wealth[i]
            ));
        }

        boolean isPossible = true;

        while (numOfHeists-- > 0) {
            if (theRiches.peek().wealth <= 100) {
                isPossible = false;
                break;
            }

            int tempIndex = theRiches.poll().index;
            wealth[tempIndex] -= 100;
            theRiches.offer(new theRich(tempIndex, wealth[tempIndex]));
        }

        if (isPossible) {
            for (int w : wealth) {
                sb.append(w).append(' ');
            }
        } else {
            sb.append("impossible");
        }

        System.out.println(sb);
    }
}
