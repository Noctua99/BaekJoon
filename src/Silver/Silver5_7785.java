package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Silver5_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int numOfAccess = Integer.parseInt(br.readLine());

        TreeSet<String> remainingEmployees = new TreeSet<>();

        while (numOfAccess-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if (st.nextToken().equals("enter")) {
                remainingEmployees.add(name);
            } else {
                remainingEmployees.remove(name);
            }
        }
        Iterator<String> itr = remainingEmployees.descendingIterator();
        while (itr.hasNext()) {
            sb.append(itr.next()).append('\n');
        }

        System.out.println(sb);
    }
}
