package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5_5522 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalScore = 0;

        for (int i = 0; i < 5; i++) {
            totalScore += Integer.parseInt(br.readLine());
        }

        System.out.println(totalScore);
    }
}
