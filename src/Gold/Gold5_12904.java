package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold5_12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        while (true) {
            int tLastIndex = T.length() - 1;
            if (T.charAt(tLastIndex) == 'A') {
                T.deleteCharAt(tLastIndex);
            } else {
                T.deleteCharAt(tLastIndex);
                T.reverse();
            }
            if (S.length() == T.length()) {
                break;
            }
        }
        if ((S.toString()).equals(T.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
