package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver3_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();

        while (N-- > 0) {
            String input = br.readLine();
            int hashcode = input.hashCode();
            set.add(hashcode);
        }

        int count = 0;
        while (M-- > 0) {
            String input = br.readLine();
            int hashcode = input.hashCode();
            if (set.contains(hashcode)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
