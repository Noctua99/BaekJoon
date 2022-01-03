package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver4_9322 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int numOfTests = Integer.parseInt(br.readLine());   // 테스트 케이스의 수
        while (numOfTests-- > 0) {
            int numOfWords = Integer.parseInt(br.readLine());   // 한 문장의 단어 수

            String[] publicKey1 = new String[numOfWords];   // 제 1 공개키
            String[] publicKey2 = new String[numOfWords];   // 제 2 공개키
            String[] cryptogram = new String[numOfWords];   // 암호문

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numOfWords; i++) {
                publicKey1[i] = st.nextToken();
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numOfWords; i++) {
                publicKey2[i] = st.nextToken();
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numOfWords; i++) {
                cryptogram[i] = st.nextToken();
            }

            decode(publicKey1, publicKey2, cryptogram);
        }
        System.out.println(sb);
    }

    public static void decode(String[] key1, String[] key2, String[] cryptogram) {
        int len = key1.length;

        HashMap<String, Integer> publicKey1 = new HashMap<>();
        HashMap<Integer, Integer> description = new HashMap<>();

        for (int i = 0; i < len; i++) {
            publicKey1.put(key1[i], i);
        }

        for (int i = 0; i < len; i++) {
            description.put(publicKey1.get(key2[i]), i);
        }

        for (int key : description.keySet()) {
            sb.append(cryptogram[description.get(key)]).append(' ');
        }
        sb.append('\n');
    }
}
