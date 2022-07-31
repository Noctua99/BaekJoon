package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_1543 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String target = br.readLine();

        int count = 0;

        for (int i = 0; i < s.length(); ) {
            int index = s.indexOf(target, i);

            if (index == -1) {
                break;
            }

            i = index + target.length();
            count++;
        }

        System.out.println(count);
    }
}
