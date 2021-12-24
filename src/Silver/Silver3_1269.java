package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver3_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int numOfElementsA = Integer.parseInt(st.nextToken());
        int numOfElementsB = Integer.parseInt(st.nextToken());

        HashSet<Integer> sumOfSetsAB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfElementsA; i++) {
            sumOfSetsAB.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfElementsB; i++) {
            sumOfSetsAB.add(Integer.parseInt(st.nextToken()));
        }

        int numOfDiffSets = numOfElementsA + numOfElementsB - sumOfSetsAB.size();
        int result = numOfElementsA + numOfElementsB - numOfDiffSets * 2;

        System.out.println(result);
    }
}
