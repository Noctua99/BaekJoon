package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_21773 {

    static class Process {
        final int id;
        int processingTime;
        int priority;

        public Process(int id, int processingTime, int priority) {
            this.id = id;
            this.processingTime = processingTime;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int numOfProcesses = Integer.parseInt(st.nextToken());

        PriorityQueue<Process> processes = new PriorityQueue<>((o1, o2) -> {
            if (o1.priority == o2.priority) {
                return o1.id - o2.id;
            }
            return o2.priority - o1.priority;
        });

        while (numOfProcesses-- > 0) {
            st = new StringTokenizer(br.readLine());
            processes.offer(new Process(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        while (!processes.isEmpty() && T-- > 0) {
            Process process = processes.poll();

            if (process.processingTime > 1) {
                process.priority--;
                process.processingTime--;
                processes.offer(process);
            }

            sb.append(process.id).append('\n');
        }

        System.out.println(sb);
    }
}
