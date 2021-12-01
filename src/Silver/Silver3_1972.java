package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver3_1972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals("*")) break;

            if (isAmazing(input)) {
                sb.append(input).append(" is surprising.").append('\n');
            } else {
                sb.append(input).append(" is NOT surprising.").append('\n');
            }
        }
        System.out.println(sb);
    }

    public static boolean isAmazing(String input) {
        for (int i = 1; i < input.length(); i++) {
            HashSet<String> set = new HashSet<>();
            for (int j = 0; j < input.length() - i; j++) {
                String temp=input.charAt(j) + "" + input.charAt(j + i);
                if(set.contains(temp)){
                    return false;
                }else{
                    set.add(temp);
                }
            }
        }
        return true;
    }
}
