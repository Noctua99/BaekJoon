package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver5_6296 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        String s = br.readLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= s.length() - N; i++) {
            set.add(s.substring(i, i + N));
        }

        System.out.println(set.size());
    }
}
