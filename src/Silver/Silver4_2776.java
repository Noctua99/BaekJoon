package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int note1Size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            HashSet<Integer> note1Numbers = new HashSet<>();
            while (note1Size-- > 0) {
                note1Numbers.add(Integer.parseInt(st.nextToken()));
            }
            int note2Size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while (note2Size-- > 0) {
                if (note1Numbers.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
