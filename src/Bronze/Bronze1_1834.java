package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1_1834 {

    public static long solve(long N) {
        return (N + 1) * (N * (N - 1) / 2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solve(Long.parseLong(br.readLine())));
    }
}
