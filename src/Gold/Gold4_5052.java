package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold4_5052 {

    public static boolean isConsistent(String[] phoneNumbers) {
        Arrays.sort(phoneNumbers);

        for (int i = 1; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i].startsWith(phoneNumbers[i - 1])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());

        while (numOfTests-- > 0) {
            int numOfPhoneNumbers = Integer.parseInt(br.readLine());

            String[] phoneNumbers = new String[numOfPhoneNumbers];

            for (int i = 0; i < numOfPhoneNumbers; i++) {
                phoneNumbers[i] = br.readLine();
            }

            sb.append(isConsistent(phoneNumbers) ? "YES\n" : "NO\n");
        }

        System.out.println(sb);
    }
}
