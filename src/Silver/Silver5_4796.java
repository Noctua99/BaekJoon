package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_4796 {

    public static int solve(int L, int P, int V) {
        int numOfDays = 0;

        while (V > P) {
            numOfDays += L;
            V -= P;
        }
        numOfDays += Math.min(V, L);

        return numOfDays;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
        int index = 1;
        while ((input = br.readLine()).charAt(0) != '0') {
            StringTokenizer st = new StringTokenizer(input);
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            sb.append("Case ").append(index++).append(": ").append(solve(L, P, V)).append('\n');
        }

        System.out.println(sb);
    }
}
