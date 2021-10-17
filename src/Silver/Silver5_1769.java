package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int count = 0;
        while (number.length() > 1) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }
            number = String.valueOf(sum);
            count++;
        }
        System.out.println(count);
        if (Integer.parseInt(number) % 3 == 0)
            System.out.println("YES");
        else {
            System.out.println("NO");
        }
    }
}
