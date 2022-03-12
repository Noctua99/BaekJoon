package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Silver5_4659 {

    static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

    public static boolean isAcceptable(String password) {
        return containsVowel(password) &&
                !has3VowelsOrConsonantsInRow(password) &&
                !isSameLetterComeTwiceExceptEEOO(password);
    }

    public static boolean containsVowel(String password) {
        return password.contains("a") || password.contains("e") || password.contains("i") || password.contains("o") || password.contains("u");
    }

    public static boolean has3VowelsOrConsonantsInRow(String password) {
        for (int i = 0; i < password.length() - 2; i++) {
            if (vowels.contains(password.charAt(i)) && vowels.contains(password.charAt(i + 1)) && vowels.contains(password.charAt(i + 2))) {
                return true;
            } else if (!vowels.contains(password.charAt(i)) && !vowels.contains(password.charAt(i + 1)) && !vowels.contains(password.charAt(i + 2))) {
                return true;
            }
        }

        return false;
    }

    public static boolean isSameLetterComeTwiceExceptEEOO(String password) {
        for (int i = 1; i < password.length(); i++) {
            if ((password.charAt(i) == password.charAt(i - 1)) && (password.charAt(i) != 'e' && password.charAt(i) != 'o')) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String password = "";
        while (!(password = br.readLine()).equals("end")) {
            sb.append('<').append(password).append("> is ")
                    .append(isAcceptable(password) ? "acceptable" : "not acceptable")
                    .append(".\n");
        }

        System.out.println(sb);
    }
}
