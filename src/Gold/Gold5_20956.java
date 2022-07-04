package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gold5_20956 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TreeMap<Integer, Deque<Integer>> iceCreams = new TreeMap<>(Comparator.reverseOrder());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int iceCreamCount = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());   // 지호가 먹을 아이스크림의 개수

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= iceCreamCount; i++) {
            int amount = Integer.parseInt(st.nextToken());

            if (!iceCreams.containsKey(amount)) {
                iceCreams.put(amount, new ArrayDeque<>());
            }
            iceCreams.get(amount).add(i);
        }

        boolean isAscending = true;

        for (int i = 0; i < M;) {
            int amount = iceCreams.firstKey();
            Deque<Integer> indexes = iceCreams.remove(amount);

            while (i < M && !indexes.isEmpty()){
                if (isAscending) {
                    sb.append(indexes.pollFirst()).append('\n');
                } else {
                    sb.append(indexes.pollLast()).append('\n');
                }

                if (amount % 7 == 0) {
                    isAscending = !isAscending;
                }

                i++;
            }
        }

        System.out.println(sb);
    }
}
