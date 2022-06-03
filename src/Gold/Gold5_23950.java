package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_23950 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTestCases = Integer.parseInt(br.readLine());
        for (int i = 1; i <= numOfTestCases; i++) {
            sb.append("Case #").append(i).append(": ");

            PriorityQueue<Integer> papers = new PriorityQueue<>();
            int numOfPapers = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (numOfPapers-- > 0) {
                papers.offer(Integer.parseInt(st.nextToken()));
                if (papers.peek() < papers.size()) {
                    papers.poll();
                }

                sb.append(papers.size()).append(' ');
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
