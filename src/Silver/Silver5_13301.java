package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_13301 {

    public static long findPerimeter(int numOfTiles) {
        if (numOfTiles == 1) return 4;

        long[] perimeters = new long[numOfTiles + 1];
        perimeters[1] = 4;
        perimeters[2] = 6;

        for (int i = 3; i <= numOfTiles; i++) {
            perimeters[i] = perimeters[i - 1] + perimeters[i - 2];
        }

        return perimeters[numOfTiles];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findPerimeter(Integer.parseInt(br.readLine())));
    }
}
