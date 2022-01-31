package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Silver4_1021 {
    static ArrayDeque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeOfQueue = Integer.parseInt(st.nextToken());
        int numOfTarget = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 1; i <= sizeOfQueue; i++) {
            deque.offerLast(i);
        }

        st = new StringTokenizer(br.readLine());
        while (numOfTarget-- > 0) {
            result += findTarget(Integer.parseInt(st.nextToken()));
        }

        System.out.println(result);
    }

    public static int findTarget(int target) {
        ArrayDeque<Integer> dequeLeft = deque.clone();
        ArrayDeque<Integer> dequeRight = deque.clone();
        int countLeft = 0;
        int countRight = 0;
        while (true) {
            if (dequeLeft.peekFirst() == target) {
                dequeLeft.pollFirst();
                break;
            }
            dequeLeft.offerLast(dequeLeft.pollFirst());
            countLeft++;
        }
        while (true) {
            if(dequeRight.peekFirst() == target){
                dequeRight.pollFirst();
                break;
            }
            dequeRight.offerFirst(dequeRight.pollLast());
            countRight++;
        }
        if (countLeft < countRight) {
            deque = dequeLeft;
            return countLeft;
        } else {
            deque = dequeRight;
            return countRight;
        }
    }
}
