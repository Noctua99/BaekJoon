package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Gold4_11199 {

    static class Person {
        final int cash;
        final int leaveTime;

        public Person(int cash, int leaveTime) {
            this.cash = cash;
            this.leaveTime = leaveTime;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int peopleNum = Integer.parseInt(st.nextToken());
        int closeTime = Integer.parseInt(st.nextToken());

        TreeSet<Integer> remainTime = new TreeSet<>();

        for (int i = 0; i < closeTime; i++) {
            remainTime.add(i);
        }

        PriorityQueue<Person> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.cash == o2.cash) {
                return o2.leaveTime - o1.leaveTime;
            }
            return o2.cash - o1.cash;
        });

        while (peopleNum-- > 0) {
            st = new StringTokenizer(br.readLine());
            queue.offer(new Person(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        int totalMoney = 0;

        while (!queue.isEmpty() && !remainTime.isEmpty()) {
            Person person = queue.poll();
            if (remainTime.floor(person.leaveTime) != null) {
                remainTime.remove(remainTime.floor(person.leaveTime));
                totalMoney += person.cash;
            }
        }

        System.out.println(totalMoney);
    }
}
