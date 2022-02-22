package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver4_2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(br.readLine()));
    }

    public static int solve(String input) {
        StringTokenizer st = new StringTokenizer(input);

        int A = Integer.parseInt(st.nextToken());
        final int P = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int index = 0;
        while (!hashMap.containsKey(A)) {
            hashMap.put(A, index++);
            int temp = 0;

            while (A != 0) {
                temp += Math.pow(A % 10, P);
                A /= 10;
            }
            A = temp;
        }

        return hashMap.get(A);
    }
}
