package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1_11719 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String input = "";
        while ((input = br.readLine()) != null) {
            result.append(input).append('\n');
        }

        System.out.println(result);
    }
}
