package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트케이스의 개수

        while (T-- > 0) {
            PriorityQueue<Long> fileCombineExpense = new PriorityQueue<>();
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while (K-- > 0) {
                fileCombineExpense.offer(Long.parseLong(st.nextToken()));
            }

            long totalSum = 0;
            long sum = 0;
            while (fileCombineExpense.size() >= 2) {
                fileCombineExpense.offer(sum = fileCombineExpense.poll() + fileCombineExpense.poll());
                totalSum += sum;
            }
            sb.append(totalSum).append('\n');
        }
        System.out.println(sb);
    }
}
