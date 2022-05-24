package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_16524 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> emails = new HashSet<>();

        int numOfEmails = Integer.parseInt(br.readLine());
        while (numOfEmails-- > 0) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), "@");
            StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "+");
            emails.add(st2.nextToken().replaceAll("\\.", "") + st1.nextToken());
        }

        System.out.println(emails.size());
    }
}
