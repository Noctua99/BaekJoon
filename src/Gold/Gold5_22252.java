package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_22252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<String, PriorityQueue<Integer>> gorillas = new HashMap<>();
        PriorityQueue<Integer> tempQueue;

        int numOfQuery = Integer.parseInt(br.readLine());
        long totalValue = 0;

        while (numOfQuery-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            String gorilla = st.nextToken();

            if (command == 1) { // 고릴라가 정보를 얻는다
                if (!gorillas.containsKey(gorilla)) {
                    gorillas.put(gorilla, new PriorityQueue<>(Collections.reverseOrder()));
                }

                int numOfInfo = Integer.parseInt(st.nextToken());
                tempQueue = gorillas.get(gorilla);
                while (numOfInfo-- > 0) {
                    tempQueue.offer(Integer.parseInt(st.nextToken()));
                }
            } else {    // 호석이가 정보를 구매한다
                int numOfPurchase = Integer.parseInt(st.nextToken());

                if (gorillas.containsKey(gorilla)) {
                    tempQueue = gorillas.get(gorilla);
                    numOfPurchase = Math.min(numOfPurchase, tempQueue.size());
                    while (numOfPurchase-- > 0) {
                        totalValue += tempQueue.poll();
                    }
                }
            }
        }
        System.out.println(totalValue);
    }
}
