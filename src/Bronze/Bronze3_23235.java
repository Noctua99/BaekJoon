package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze3_23235 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10000; i++) {
            String input = br.readLine();

            if (input.equals("0")) break;

            sb.append("Case ").append(i).append(": Sorting... done!\n");
        }

        System.out.println(sb);
    }
}
