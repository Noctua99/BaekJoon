package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5_24086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                -Integer.parseInt(br.readLine()) +
                        Integer.parseInt(br.readLine())
        );
    }
}
