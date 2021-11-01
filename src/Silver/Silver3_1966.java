package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver3_1966 {
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
            sb.append(printerQueue(M)).append('\n');
        }
        System.out.print(sb);
    }

    public static int printerQueue(int M) {
        int index = M;      // 출력해야 하는 목표
        int count = 1;      // 출력한 횟수

        while (true) {
            int max = 0;
            for (int data : queue) {
                max = Math.max(data, max);
            }

            while(true){
                if (queue.peek() == max) {
                    queue.poll();
                    if (index == 0) return count;
                    index--;
                    if (index < 0) index += queue.size();
                    count++;
                    break;
                } else {
                    queue.add(queue.poll());
                    index--;
                    if (index < 0) index += queue.size();
                }
            }
        }
    }
}
