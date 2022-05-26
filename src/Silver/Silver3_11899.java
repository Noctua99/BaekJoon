package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_11899 {

    public static int findMinBracketsNum(String s) {
        int bracketsNum = 0;
        int numOfLeftB = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                numOfLeftB++;
            } else {
                if (numOfLeftB == 0) {
                    bracketsNum++;
                } else {
                    numOfLeftB--;
                }
            }
        }

        return bracketsNum + numOfLeftB;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findMinBracketsNum(br.readLine()));
    }
}
