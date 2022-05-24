package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver4_25192 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> nicknames = new HashSet<>();

        int iconCount = 0;

        int numOfChats = Integer.parseInt(br.readLine());
        while (numOfChats-- > 0) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                iconCount += nicknames.size();
                nicknames.clear();
            } else {
                nicknames.add(input);
            }
        }

        iconCount += nicknames.size();

        System.out.println(iconCount);
    }
}
