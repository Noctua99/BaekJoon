package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1_11729 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfDisks = Integer.parseInt(br.readLine());

        sb.append(findMoveCount(numOfDisks)).append('\n');

        move(numOfDisks, 1, 3, 2);

        System.out.println(sb);
    }

    public static int findMoveCount(int numOfDisks) {
        return (int) (Math.pow(2, numOfDisks) - 1);
    }

    public static void move(int numOfDisks, int start, int end, int sub) {
        if (numOfDisks == 1) {
            sb.append(start).append(" ").append(end).append('\n');
            return;
        }

        move(numOfDisks - 1, start, sub, end);

        move(1, start, end, sub);

        move(numOfDisks - 1, sub, end, start);
    }
}
