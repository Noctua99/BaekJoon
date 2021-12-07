package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold4_23294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 웹페이지의 종류의 수
        int Q = Integer.parseInt(st.nextToken());   // 사용자가 수행하는 작업의 개수
        int maxCacheVol = Integer.parseInt(st.nextToken()); // 최대 캐시 용량

        st = new StringTokenizer(br.readLine());
        int[] cacheSize = new int[N + 1];   // i번째 웹페이지를 방문할 때 사용하는 캐시의 크기
        for (int i = 1; i <= N; i++) {
            cacheSize[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> backward = new ArrayDeque<>();    // 뒤로 가기 공간 + 현재 접속한 페이지
        Stack<Integer> forward = new Stack<>();     // 앞으로 가기 공간
        int cacheInUse = 0;

        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "B":   // 뒤로 가기
                    if (backward.size() >= 2) {
                        forward.add(backward.pollLast());
                    }
                    break;
                case "F":   // 앞으로 가기
                    if (!forward.isEmpty()) {
                        backward.offerLast(forward.pop());
                    }
                    break;
                case "A":   // 웹페이지 접속
                    while (!forward.isEmpty()) {
                        cacheInUse -= cacheSize[forward.pop()];
                    }
                    int index = Integer.parseInt(st.nextToken());
                    backward.offerLast(index);
                    cacheInUse += cacheSize[index];
                    while (cacheInUse > maxCacheVol) {
                        int tempIndex = backward.pollFirst();
                        cacheInUse -= cacheSize[tempIndex];
                    }
                    break;
                case "C":   // 압축
                    if (backward.size() > 2) {
                        int nowPage = backward.pollLast();
                        Stack<Integer> tempStack = new Stack<>();
                        while (!backward.isEmpty()) {
                            tempStack.add(backward.pollLast());
                        }
                        backward.offerLast(tempStack.pop());
                        while (!tempStack.isEmpty()) {
                            int temp = tempStack.pop();
                            if (backward.peekLast() != temp) {
                                backward.offerLast(temp);
                            } else {
                                cacheInUse -= cacheSize[temp];
                            }
                        }
                        backward.offerLast(nowPage);
                    }
            }
        }
        sb.append(backward.pollLast()).append('\n');
        if (backward.isEmpty()) {
            sb.append(-1).append('\n');
        } else {
            while (!backward.isEmpty()) {
                sb.append(backward.pollLast()).append(" ");
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