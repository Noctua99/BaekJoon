package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Silver5_1059 {

    static TreeSet<Integer> set = new TreeSet<>();

    public static int findNumOfGoodSections(int num) {
        if (set.contains(num)) return 0;

        if (set.first() > num) return (set.first() - num) * num - 1;

        return (set.higher(num) - num) * (num - set.lower(num)) - 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sizeOfSet = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (sizeOfSet-- > 0) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(findNumOfGoodSections(Integer.parseInt(br.readLine())));
    }
}
