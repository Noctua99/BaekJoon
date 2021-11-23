package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Gold5_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트케이스의 개수
        while (T-- > 0) {
            TreeMap<Integer, Integer> treemap = new TreeMap<>();
            int K = Integer.parseInt(br.readLine());    // 큐에 적용될 연산의 개수
            while (K-- > 0) {
                st = new StringTokenizer(br.readLine());
                char command = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                if (command == 'I') {
                    treemap.put(num, treemap.getOrDefault(num, 0) + 1);
                } else {
                    if (!treemap.isEmpty()) {
                        int key = num == 1 ? treemap.lastKey() : treemap.firstKey();
                        if (treemap.get(key) == 1) {
                            treemap.remove(key);
                        } else {
                            treemap.put(key, treemap.get(key) - 1);
                        }
                    }
                }
            }
            if (treemap.isEmpty()) {
                sb.append("EMPTY").append('\n');
            } else {
                sb.append(treemap.lastKey()).append(" ").append(treemap.firstKey()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
