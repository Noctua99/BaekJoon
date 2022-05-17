package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_11292 {

    static class Person {
        final String name;
        final int height;
        final int order;

        public Person(String name, int height, int order) {
            this.name = name;
            this.height = height;
            this.order = order;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int numOfGroups = Integer.parseInt(br.readLine());

            if (numOfGroups == 0) break;

            Person[] people = new Person[numOfGroups];

            for (int i = 0; i < numOfGroups; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                people[i] = new Person(
                        st.nextToken(),
                        Integer.parseInt(st.nextToken().replace(".", "")),
                        i
                );
            }

            Arrays.sort(people, (o1, o2) -> {
                if (o1.height == o2.height) {
                    return o1.order - o2.order;
                }
                return o2.height - o1.height;
            });

            int tallestHeight = people[0].height;

            for (Person person : people) {
                if (person.height == tallestHeight) {
                    sb.append(person.name).append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
