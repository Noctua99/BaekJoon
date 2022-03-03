package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Bronze1_15098 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isRepeated(br.readLine()) ? "no" : "yes");
    }

    public static boolean isRepeated(String input) {
        String[] words = input.split(" ");

        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));

        return words.length != wordSet.size();
    }
}
