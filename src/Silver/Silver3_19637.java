package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Silver3_19637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TreeMap<Integer, String> powerToTitle = new TreeMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfTitle = Integer.parseInt(st.nextToken());  // 칭호의 개수
        int numOfChar = Integer.parseInt(st.nextToken());   // 칭호를 출력해야 하는 캐릭터들의 개수

        st = new StringTokenizer(br.readLine());
        String title = st.nextToken();
        int power = Integer.parseInt(st.nextToken());
        powerToTitle.put(power, title);

        while (numOfTitle-- > 1) {
            st = new StringTokenizer(br.readLine());
            title = st.nextToken();
            power = Integer.parseInt(st.nextToken());
            if (powerToTitle.lastKey() != power) {
                powerToTitle.put(power, title);
            }
        }

        while (numOfChar-- > 0) {
            sb.append(powerToTitle.ceilingEntry(Integer.parseInt(br.readLine())).getValue()).append('\n');
        }

        System.out.println(sb);
    }
}
