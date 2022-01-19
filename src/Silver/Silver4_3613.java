package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_3613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String var = br.readLine();
        String result;

        if (isJava(var)) {
            result = javaToCpp(var);
        } else if (isCpp(var)) {
            result = cppToJava(var);
        } else {
            result = "Error!";
        }

        System.out.println(result);
    }

    // 첫 단어는 소문자로 쓰고, 다음 단어부터는 첫 문자만 대문자로 쓴다
    public static boolean isJava(String var) {
        if (var.contains("_")) {
            return false;
        }
        return var.charAt(0) >= 'a';
    }

    // 변수명에 소문자만 사용하고, 단어와 단어를 구분하기 위해 '_'을 이용한다
    public static boolean isCpp(String var) {
        int len = var.length();
        if (var.charAt(0) == '_' || var.charAt(len - 1) == '_') return false;
        for (int i = 0; i < len; i++) {
            if (var.charAt(i) <= 'Z') {
                return false;
            }
        }
        for (int i = 1; i < len - 2; i++) {
            if (var.charAt(i) == '_' && var.charAt(i + 1) == '_') {
                return false;
            }
        }
        return true;
    }

    public static String javaToCpp(String javaVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < javaVar.length(); i++) {
            if (javaVar.charAt(i) <= 'Z') {
                sb.append('_').append((char) (javaVar.charAt(i) + 32));
            } else {
                sb.append(javaVar.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String cppToJava(String cppVar) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(cppVar, "_");
        sb.append(st.nextToken());
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            sb.append((char) (word.charAt(0) - 32));
            for (int i = 1; i < word.length(); i++) {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }
}
