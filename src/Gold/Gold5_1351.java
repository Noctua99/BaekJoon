package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Gold5_1351 {

    static HashMap<Long, Long> map = new HashMap<>();
    static int P, Q;

    public static long solve(long N) {
        if (N == 0) return 1;

        if (map.containsKey(N)) {
            return map.get(N);
        }

        map.put(N, solve(N / P) + solve(N / Q));

        return map.get(N);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        System.out.println(solve(N));
    }
}
