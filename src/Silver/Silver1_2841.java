package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver1_2841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<Integer, Stack<Integer>> guitar = new HashMap<>();
        for (int i = 1; i <= 6; i++) {
            guitar.put(i, new Stack<>());
        }

        st = new StringTokenizer(br.readLine());
        int NumOfPitch = Integer.parseInt(st.nextToken());  // 멜로디에 포함되어 있는 음의 수
        int NumOfFret = Integer.parseInt(st.nextToken());   // 한 줄에 있는 프렛의 수

        int moveCount = 0;

        while (NumOfPitch-- > 0) {
            st = new StringTokenizer(br.readLine());
            int pitch = Integer.parseInt(st.nextToken());   // 줄의 번호
            int fret = Integer.parseInt(st.nextToken());    // 눌러야 하는 프렛의 번호

            Stack<Integer> tempStack = guitar.get(pitch);

            while (true) {
                if (tempStack.isEmpty()) {
                    tempStack.push(fret);
                    moveCount++;
                    break;
                } else if (tempStack.peek() < fret) {
                    tempStack.push(fret);
                    moveCount++;
                    break;
                } else if (tempStack.peek() == fret) {
                    break;
                } else {
                    tempStack.pop();
                    moveCount++;
                }
            }
        }
        System.out.println(moveCount);
    }
}