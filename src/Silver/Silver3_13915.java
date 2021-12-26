package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver3_13915 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        while ((input = br.readLine()) != null) {
            int numOfTest = Integer.parseInt(input);

            HashSet<String> proficiencySet = new HashSet<>();
            while (numOfTest-- > 0) {
                proficiencySet.add(removeDuplicates(br.readLine()));
            }

            sb.append(proficiencySet.size()).append('\n');
        }
        System.out.println(sb);
    }

    public static String removeDuplicates(String flightRecord) {
        int len = flightRecord.length();
        HashSet<Character> balloonSet = new HashSet<>();
        for (int i = 0; i < len; i++) {
            balloonSet.add(flightRecord.charAt(i));
        }
        return balloonSet.toString();
    }
}
