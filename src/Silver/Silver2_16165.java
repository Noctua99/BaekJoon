package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver2_16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 총 입력 받을 걸그룹의 수
        int M = Integer.parseInt(st.nextToken());   // 맞혀야 할 문제의 수

        HashMap<String, ArrayList<String>> girlGroups = new HashMap<>();

        while (N-- > 0) {
            String groupNames = br.readLine();
            int number = Integer.parseInt(br.readLine());
            ArrayList<String> names = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                names.add(br.readLine());
            }
            Collections.sort(names);
            girlGroups.put(groupNames, names);
        }
        while (M-- > 0) {
            String quiz = br.readLine();
            if (br.readLine().equals("1")) {    // 그룹이름 맞추기
                for (String groupName : girlGroups.keySet()) {
                    if (girlGroups.get(groupName).contains(quiz)) {
                        sb.append(groupName).append('\n');
                    }
                }
            } else {    // 멤버 맞추기
                ArrayList<String> names = girlGroups.get(quiz);
                for (String name : names) {
                    sb.append(name).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
