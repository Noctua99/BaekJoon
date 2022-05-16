package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5_5554 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalSeconds = 0;

        for (int i = 0; i < 4; i++) {
            totalSeconds += Integer.parseInt(br.readLine());
        }

        System.out.println(totalSeconds / 60);
        System.out.println(totalSeconds % 60);
    }
}
