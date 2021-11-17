package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Gold5_5430 {
    static Deque<String> deque;
    static String command;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            command = br.readLine();     // 수행할 함수
            int len = Integer.parseInt(br.readLine());      // 배열에 들어있는 수의 개수

            deque = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine(), ",[]");     // ',' '[' ']'를 구분자로 사용하여 분리
            for (int i = 0; i < len; i++) {
                deque.add(st.nextToken());
            }
            AC();
        }
        System.out.println(sb);
    }

    public static void AC() {
        boolean isReversed = false;     // 순서가 뒤집혔으면 true
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'R') {
                isReversed = !isReversed;
            } else {
                if (deque.isEmpty()) {
                    sb.append("error").append('\n');
                    return;
                }
                if (isReversed) {
                    deque.removeLast();
                } else {
                    deque.removeFirst();
                }
            }
        }
        makeOutput(isReversed);
    }

    public static void makeOutput(boolean isReversed) {
        int size = deque.size();

        sb.append("[");
        if (isReversed) {
            for (int i = 0; i < size - 1; i++) {
                sb.append(deque.removeLast()).append(',');
            }
        } else {
            for (int i = 0; i < size - 1; i++) {
                sb.append(deque.removeFirst()).append(',');
            }
        }
        if(!deque.isEmpty()){
            sb.append(deque.remove());
        }
        sb.append("]").append('\n');
    }
}
