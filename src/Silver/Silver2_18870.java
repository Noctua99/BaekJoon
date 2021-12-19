package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Silver2_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, new ArrayList<>());
            }
            treeMap.get(key).add(i);
        }

        int[] results = new int[N];
        int i = 0;
        for (int key : treeMap.keySet()) {
            for (int number : treeMap.get(key)) {
                results[number] = i;
            }
            i++;
        }

        for (int result : results) {
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }
}
