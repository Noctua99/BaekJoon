package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Silver5_6325 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int programNum = 1;
        while (true) {
            int lineNum = Integer.parseInt(br.readLine());

            if (lineNum == 0) break;

            HashMap<String, Boolean> hashMap = new HashMap<>();
            TreeSet<String> treeSet = new TreeSet<>();

            hashMap.put("a", true);

            while (lineNum-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), "= ");
                String var1 = st.nextToken();
                String var2 = st.nextToken();

                if (hashMap.containsKey(var2)) {
                    hashMap.put(var1, hashMap.get(var2));
                } else {
                    hashMap.put(var1, false);
                    hashMap.put(var2, false);
                }
            }

            for (Map.Entry<String, Boolean> entry : hashMap.entrySet()) {
                if (entry.getValue()) {
                    treeSet.add(entry.getKey());
                }
            }

            sb.append("Program #").append(programNum++).append('\n');

            if (treeSet.isEmpty()) {
                sb.append("none");
            } else {
                for (String s : treeSet) {
                    sb.append(s).append(' ');
                }
            }
            sb.append("\n\n");
        }

        System.out.println(sb);
    }
}
