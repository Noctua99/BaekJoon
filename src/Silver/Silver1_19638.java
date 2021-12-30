package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver1_19638 {
    static PriorityQueue<Integer> heightsOfGiants = new PriorityQueue<>(Collections.reverseOrder());
    static int numOfUsedHammer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numOfGiants = Integer.parseInt(st.nextToken());
        int heightOfCenti = Integer.parseInt(st.nextToken());
        int hammerLimit = Integer.parseInt(st.nextToken());

        while (numOfGiants-- > 0) {
            heightsOfGiants.offer(Integer.parseInt(br.readLine()));
        }

        if (canBeTallest(heightOfCenti, hammerLimit)){
            System.out.println("YES");
            System.out.println(numOfUsedHammer);
        } else{
            System.out.println("NO");
            System.out.println(heightsOfGiants.peek());
        }
    }

    public static boolean canBeTallest(int heightOfCenti, int hammerLimit) {

        if (heightOfCenti > heightsOfGiants.peek()) {
            return true;
        } else {
            while (hammerLimit-- > 0) {
                if (heightsOfGiants.peek() == 1) {
                    return false;
                }
                heightsOfGiants.offer(heightsOfGiants.poll() / 2);
                numOfUsedHammer++;
                if (heightOfCenti > heightsOfGiants.peek()) {
                    return true;
                }
            }
        }
        return false;
    }
}
