package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver1_9009 {
    public static void main(String[] args) throws IOException {
        int[] fibo = new int[45];
        fibo[1] = 1;
        for (int i = 2; i < 45; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testAmount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> tempStack;
        for (int t = 0; t < testAmount; t++) {
            int testData = Integer.parseInt(br.readLine());
            tempStack = new Stack<>();
            int index = 44;
            while (testData > 0) {
                for (int i = index; i >= 0; i--) {
                    if (testData >= fibo[i]) {
                        tempStack.push(fibo[i]);
                        testData -= fibo[i];
                        index = i - 1;
                        break;
                    }
                }
            }
            int size = tempStack.size();
            for (int i = 0; i < size; i++) {
                sb.append(tempStack.pop()).append(" ");
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
