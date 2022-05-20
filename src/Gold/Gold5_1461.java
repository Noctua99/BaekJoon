package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold5_1461 {

    static int[] books;
    static int canHoldAtOnce;   // 세준이가 한 번에 들 수 있는 책의 개수
    static int numOfNegative = 0;

    public static int findMinNumOfSteps() {
        int numOfSteps = 0;

        Arrays.sort(books);

        int pointer1 = 0;
        int pointer2 = books.length - 1;

        if (Math.abs(books[pointer1]) > Math.abs(books[pointer2])) {
            numOfSteps += Math.abs(books[pointer1]);
            pointer1 += canHoldAtOnce;
        } else {
            numOfSteps += Math.abs(books[pointer2]);
            pointer2 -= canHoldAtOnce;
        }

        while (pointer1 < numOfNegative) {
            numOfSteps += Math.abs(books[pointer1]) * 2;
            pointer1 += canHoldAtOnce;
        }

        while (pointer2 >= numOfNegative) {
            numOfSteps += books[pointer2] * 2;
            pointer2 -= canHoldAtOnce;
        }

        return numOfSteps;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfBooks = Integer.parseInt(st.nextToken());  // 책의 개수
        canHoldAtOnce = Integer.parseInt(st.nextToken());

        books = new int[numOfBooks];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfBooks; i++) {
            books[i] = Integer.parseInt(st.nextToken());
            if (books[i] < 0) {
                numOfNegative++;
            }
        }

        System.out.println(findMinNumOfSteps());
    }
}
