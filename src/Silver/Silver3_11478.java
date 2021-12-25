package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver3_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(findSubset(input));
    }

    public static int findSubset(String str) {
        int len = str.length();

        HashSet<String> subsets = new HashSet<>();
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= len - i; j++) {
                subsets.add(str.substring(j, j + i));
            }
        }

        return subsets.size();
    }
}
