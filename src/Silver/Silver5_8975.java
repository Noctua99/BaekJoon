package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver5_8975 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        int half = N / 2;

        while (N-- > 0) {
            set.add(br.readLine());
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 1; i <= M; i++) {
            if (set.remove(br.readLine()) && set.size() <= half) {
                System.out.println(i);
                break;
            }
        }
    }
}
