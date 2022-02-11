package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int playerNum = Integer.parseInt(br.readLine());
        String[] players = new String[playerNum];

        for (int i = 0; i < playerNum; i++) {
            players[i] = br.readLine();
        }

        System.out.println(solve(players));
    }

    public static String solve(String[] arr) {
        String result = "";
        if (isAscending(arr)) {
            result = "INCREASING";
        } else if (isDescending(arr)) {
            result = "DECREASING";
        } else {
            result = "NEITHER";
        }

        return result;
    }

    public static boolean isAscending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDescending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) > 0) {
                return false;
            }
        }

        return true;
    }
}
