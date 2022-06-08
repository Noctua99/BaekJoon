package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_17989 {

    static class Book {
        int receivedTime;
        final String title;
        final int numOfPages;

        public Book(String title, int numOfPages) {
            this.title = title;
            this.numOfPages = numOfPages;
        }

        public Book(int receivedTime, String title, int numOfPages) {
            this.receivedTime = receivedTime;
            this.title = title;
            this.numOfPages = numOfPages;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Book> unreadBooks = new PriorityQueue<>(Comparator.comparing(o -> o.title));
        PriorityQueue<Book> receivedBooks = new PriorityQueue<>(Comparator.comparing(o -> o.receivedTime));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfUnreadBooks = Integer.parseInt(st.nextToken());
        int numOfReceivedBooks = Integer.parseInt(st.nextToken());

        unreadBooks.offer(new Book(
                "Jane Eyre", Integer.parseInt(st.nextToken())
        ));

        while (numOfUnreadBooks-- > 0) {
            st = new StringTokenizer(br.readLine(), "\"");
            unreadBooks.offer(new Book(
                    st.nextToken(), Integer.parseInt(st.nextToken().trim())
            ));
        }

        while (numOfReceivedBooks-- > 0) {
            st = new StringTokenizer(br.readLine(), "\"");
            receivedBooks.offer(new Book(
                    Integer.parseInt(st.nextToken().trim()),
                    st.nextToken(),
                    Integer.parseInt(st.nextToken().trim())
            ));
        }

        long totalTime = 0;

        while (true) {
            while (!receivedBooks.isEmpty() && receivedBooks.peek().receivedTime <= totalTime) {
                unreadBooks.offer(receivedBooks.poll());
            }

            if (unreadBooks.peek().title.equals("Jane Eyre")) {
                totalTime += unreadBooks.peek().numOfPages;
                break;
            }

            totalTime += unreadBooks.poll().numOfPages;
        }

        System.out.println(totalTime);
    }
}
