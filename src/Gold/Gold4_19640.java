package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Gold4_19640 {

    static class Employee {
        final int lineIndex;
        final int daysOfService;    // 근무 일수
        final int urgentDegree; // 화장실이 급한 정도
        final boolean isDeka;

        public Employee(int lineIndex, int daysOfService, int urgentDegree, boolean isDeka) {
            this.lineIndex = lineIndex;
            this.daysOfService = daysOfService;
            this.urgentDegree = urgentDegree;
            this.isDeka = isDeka;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int employeeNum = Integer.parseInt(st.nextToken()); // 임시 화장실에 대기하고 있는 사원의 수
        int lineNum = Math.min(Integer.parseInt(st.nextToken()), employeeNum); // 사장이 지시한 새로운 줄의 수
        int K = Integer.parseInt(st.nextToken());   // 데카가 화장실에 도착했을 때 자신의 앞에 서 있던 사원의 수

        Queue<Employee>[] lines = new Queue[lineNum];

        for (int i = 0; i < lineNum; i++) {
            lines[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < employeeNum; i++) {
            st = new StringTokenizer(br.readLine());
            lines[i % lineNum].offer(new Employee(
                    i % lineNum,
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    i == K
            ));
        }

        PriorityQueue<Employee> peeks = new PriorityQueue<>((o1, o2) -> {
            if (o1.daysOfService == o2.daysOfService) {
                if (o1.urgentDegree == o2.urgentDegree) {
                    return o1.lineIndex - o2.lineIndex;
                }
                return o2.urgentDegree - o1.urgentDegree;
            }
            return o2.daysOfService - o1.daysOfService;
        });

        for (int i = 0; i < lineNum; i++) {
            peeks.offer(lines[i].poll());
        }

        int count = 0;
        while (true) {
            Employee employee = peeks.poll();

            if (employee.isDeka) break;

            int lineIndex = employee.lineIndex;
            if (!lines[lineIndex].isEmpty()) {
                peeks.offer(lines[lineIndex].poll());
            }
            count++;
        }

        System.out.println(count);
    }
}
