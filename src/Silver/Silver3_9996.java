package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_9996 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int numOfFiles = Integer.parseInt(br.readLine());
        final String pattern = br.readLine().replace("*",".*");

        while (numOfFiles-- > 0) {
            result.append(br.readLine().matches(pattern) ? "DA\n" : "NE\n");
        }

        System.out.println(result);
    }
}
