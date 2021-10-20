package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver5_11723 {
    static HashSet<Integer> numSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testAmount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testAmount; i++) {
            st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            int num;
            switch (type) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    if (numSet.contains(num)) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    toggle(num);
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }
        System.out.print(sb);
    }

    public static void add(int num) {
        numSet.add(num);
    }

    public static void remove(int num) {
        numSet.remove(num);
    }


    public static void toggle(int num) {
        if (numSet.contains(num)) {
            numSet.remove(num);
        } else {
            numSet.add(num);
        }
    }

    public static void all() {
        numSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    }

    public static void empty() {
        numSet = new HashSet<>();
    }
}
