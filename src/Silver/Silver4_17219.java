package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver4_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 저장된 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken());   // 비밀번호를 찾으려는 사이트 주소의 수

        HashMap<String, String> addressAndPW = new HashMap<>(); // 주소와 비밀번호를 저장할 Map
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            addressAndPW.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            sb.append(addressAndPW.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}
