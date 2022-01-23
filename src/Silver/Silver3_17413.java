package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(reverseWords(br.readLine()));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                sb.append(temp.reverse());
                temp.setLength(0);
                while (true) {
                    sb.append(s.charAt(i));
                    i++;
                    if (s.charAt(i) == '>') {
                        sb.append(s.charAt(i));
                        break;
                    }
                }
            } else if (s.charAt(i) == ' ') {
                sb.append(temp.reverse());
                temp.setLength(0);
                sb.append(' ');
            } else {
                temp.append(s.charAt(i));
            }
        }
        sb.append(temp.reverse());

        return sb.toString();
    }
}
