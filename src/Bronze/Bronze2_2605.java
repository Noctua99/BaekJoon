package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bronze2_2605 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> list = new LinkedList<>();

        int studNum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < studNum; i++) {
            list.add(list.size() - Integer.parseInt(st.nextToken()), i + 1);
        }

        for (int data : list) {
            sb.append(data).append(' ');
        }

        System.out.println(sb);
    }
}
