package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Silver5_11645 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());

        while (testNum-- > 0) {
            Set<String> set = new HashSet<>();

            int wordNum = Integer.parseInt(br.readLine());

            while (wordNum-- > 0) {
                set.add(br.readLine());
            }

            sb.append(set.size()).append('\n');
        }

        System.out.println(sb);
    }
}
