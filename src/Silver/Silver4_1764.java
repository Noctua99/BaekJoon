package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> notHearReadList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            if (set.contains(temp)) {
                notHearReadList.add(temp);
            }
        }
        Collections.sort(notHearReadList);

        StringBuilder sb = new StringBuilder();
        sb.append(notHearReadList.size()).append('\n');
        for (String notHearRead : notHearReadList) {
            sb.append(notHearRead).append('\n');
        }
        System.out.println(sb);
    }
}
