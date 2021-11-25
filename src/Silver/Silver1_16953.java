package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 0;
        while (A < B) {
            if (B % 2 == 0) {
                B = B / 2;
            } else if (B % 10 == 1) {
                B = B / 10;
            } else {
                break;
            }
            count++;
        }
        if (A == B) {
            System.out.println(count + 1);
        } else {
            System.out.println(-1);
        }
    }
}
