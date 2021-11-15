package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Silver5_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;

        ArrayList<Integer> humans = new ArrayList<>(N);

        for (int i = 1; i <= N; i++) {
            humans.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int count = 0;
        while (N-- > 1) {
            count += K;
            if (count >= humans.size()) count %= humans.size();

            sb.append(humans.remove(count)).append(", ");
        }
        sb.append(humans.remove(0)).append(">");

        System.out.println(sb);
    }
}