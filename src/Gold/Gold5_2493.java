package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold5_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTops = Integer.parseInt(br.readLine());
        int[] tops = new int[numOfTops + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= numOfTops; i++) {
            tops[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> indexes = new Stack<>();
        for (int i = 1; i <= numOfTops; i++) {
            while (true) {
                if (indexes.isEmpty()) {
                    sb.append("0 ");
                    indexes.push(i);
                    break;
                }
                if (tops[indexes.peek()] < tops[i]) {
                    indexes.pop();
                } else {
                    sb.append(indexes.peek()).append(" ");
                    indexes.push(i);
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
