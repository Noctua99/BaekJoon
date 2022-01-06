package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Gold3_12757 {
    static TreeMap<Integer, Integer> JBNU = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfData = Integer.parseInt(st.nextToken());
        int numOfCommand = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        // database initialization
        while (numOfData-- > 0) {
            st = new StringTokenizer(br.readLine());
            JBNU.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        // command execution
        while (numOfCommand-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int key = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1: // add data
                    JBNU.put(key, Integer.parseInt(st.nextToken()));
                    break;
                case 2: // update data
                    int value = Integer.parseInt(st.nextToken());
                    if (JBNU.containsKey(key)) {
                        JBNU.put(key, value);
                    } else {
                        int closestKey = searchKey(JBNU.higherKey(key), JBNU.lowerKey(key), key, limit);
                        if (closestKey >= 0) {
                            JBNU.put(closestKey, value);
                        }
                    }
                    break;
                case 3: // search data
                    if (JBNU.containsKey(key)) {
                        sb.append(JBNU.get(key)).append('\n');
                    } else {
                        int closestKey = searchKey(JBNU.higherKey(key), JBNU.lowerKey(key), key, limit);
                        if (closestKey == -1) {     // There is no key
                            sb.append(-1).append('\n');
                        } else if (closestKey == -2) {  // There are more than two keys
                            sb.append('?').append('\n');
                        } else {
                            sb.append(JBNU.get(closestKey)).append('\n');
                        }
                    }
                    break;
            }
        }

        System.out.println(sb);
    }

    public static int searchKey(Integer bigger, Integer smaller, int key, int limit) {
        if (bigger == null) {
            bigger = -limit;
        }
        if (smaller == null) {
            smaller = -limit;
        }

        int dif1 = Math.abs(bigger - key);
        int dif2 = Math.abs(smaller - key);

        if (dif1 > limit && dif2 > limit) {     // There is no key
            return -1;
        } else if (dif1 == dif2) {    // There are more than two keys
            return -2;
        } else if (dif1 > dif2) {
            return smaller;
        } else {
            return bigger;
        }
    }
}
