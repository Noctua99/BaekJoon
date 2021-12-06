package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver1_23300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int Q = Integer.parseInt(st.nextToken());   // 사용자가 수행하는 작업의 개수

        Stack<Integer> backward = new Stack<>();    // 뒤로 가기 공간 + 현재 접속한 페이지
        Stack<Integer> forward = new Stack<>();     // 앞으로 가기 공간

        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "B":   // 뒤로 가기
                    if (backward.size() >= 2) {
                        forward.add(backward.pop());
                    }
                    break;
                case "F":   // 앞으로 가기
                    if (!forward.isEmpty()) {
                        backward.add(forward.pop());
                    }
                    break;
                case "A":   // 웹페이지 접속
                    forward.clear();
                    backward.add(Integer.parseInt(st.nextToken()));
                    break;
                case "C":   // 압축
                    if (backward.size() > 2) {
                        int nowPage = backward.pop();
                        Stack<Integer> tempStack = new Stack<>();
                        while (!backward.isEmpty()) {
                            tempStack.add(backward.pop());
                        }
                        backward.add(tempStack.pop());
                        while (!tempStack.isEmpty()) {
                            int temp = tempStack.pop();
                            if (backward.peek() != temp) {
                                backward.add(temp);
                            }
                        }
                        backward.add(nowPage);
                    }
            }
        }
        sb.append(backward.pop()).append('\n');
        if (backward.isEmpty()) {
            sb.append(-1).append('\n');
        } else {
            while (!backward.isEmpty()) {
                sb.append(backward.pop()).append(" ");
            }
            sb.append('\n');
        }
        if (forward.isEmpty()) {
            sb.append(-1).append('\n');
        } else {
            while (!forward.isEmpty()) {
                sb.append(forward.pop()).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
