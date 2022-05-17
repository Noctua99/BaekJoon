package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver5_11346 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sizeOfCList = Integer.parseInt(st.nextToken()); //  the size of Cornell’s list
            int sizeOfWList = Integer.parseInt(st.nextToken()); // the size of White’s list

            HashSet<String> names = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            while (sizeOfCList-- > 0) {
                names.add(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            while (sizeOfWList-- > 0) {
                names.add(st.nextToken());
            }

            sb.append(names.size()).append('\n');
        }

        System.out.println(sb);
    }
}
