package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver2_22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());    // 메모장에 적은 키워드 개수
        int M = Integer.parseInt(st.nextToken());    // 블로그에 쓴 글의 개수

        HashSet<String> keywords = new HashSet<>();
        while (N-- > 0) {
            keywords.add(br.readLine());
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), ",");
            while (st.hasMoreTokens()) {
                keywords.remove(st.nextToken());
            }
            sb.append(keywords.size()).append('\n');
        }

        System.out.println(sb);
    }
}
