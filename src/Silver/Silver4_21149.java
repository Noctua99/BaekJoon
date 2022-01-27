package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver4_21149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> peopleSMS = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfPeople = Integer.parseInt(st.nextToken());
        int numOfSMS = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= numOfSMS; i++) {
            long totalSMS = 0;

            peopleSMS.replaceAll((p, v) -> peopleSMS.get(p) + 1);
            peopleSMS.put(Integer.parseInt(br.readLine()), 0);

            for (int sms : peopleSMS.values()) {
                totalSMS += sms;
            }
            totalSMS += (long) (numOfPeople - peopleSMS.size()) * i;

            sb.append(totalSMS).append('\n');
        }

        System.out.println(sb);
    }
}
