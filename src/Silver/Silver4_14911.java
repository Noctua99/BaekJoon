package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Silver4_14911 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<int[]> set = new TreeSet<>(Comparator.comparingInt(o -> o[0]));

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Integer::compareTo);

        int sum = Integer.parseInt(br.readLine());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int num1 = list.get(i);
                int num2 = list.get(j);

                if (num1 + num2 == sum) {
                    set.add(new int[]{num1, num2});
                } else if (num1 + num2 > sum) break;
            }
        }

        for (int[] arr : set) {
            sb.append(arr[0]).append(' ').append(arr[1]).append('\n');
        }
        sb.append(set.size());

        System.out.println(sb);
    }
}
