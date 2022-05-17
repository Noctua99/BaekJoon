package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver5_5957 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> unWashed = new Stack<>();
        Stack<Integer> washed = new Stack<>();
        Stack<Integer> dried = new Stack<>();

        int numOfDishes = Integer.parseInt(br.readLine());

        for (int i = numOfDishes; i > 0; i--) {
            unWashed.add(i);
        }

        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            String indicator = st.nextToken();
            int tempNumOfDishes = Integer.parseInt(st.nextToken());
            // Bessie washing
            if (indicator.equals("1")) {
                for (int i = 0; i < tempNumOfDishes; i++) {
                    if (unWashed.isEmpty()) break;
                    washed.push(unWashed.pop());
                }
            }
            // Canmuu drying
            else {
                for (int i = 0; i < tempNumOfDishes; i++) {
                    if (washed.isEmpty()) break;
                    dried.push(washed.pop());
                }
            }
        }

        while (!dried.isEmpty()) {
            sb.append(dried.pop()).append('\n');
        }

        System.out.println(sb);
    }
}
