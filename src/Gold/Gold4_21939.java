package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Problem implements Comparable<Problem> {
    final int num;
    final int diff;

    public Problem(int num, int diff) {
        this.num = num;
        this.diff = diff;
    }

    @Override
    public int compareTo(Problem o) {
        if (this.diff == o.diff) {
            return this.num - o.num;
        } else {
            return this.diff - o.diff;
        }
    }
}

public class Gold4_21939 {
    static TreeSet<Problem> problems = new TreeSet<>();
    static HashMap<Integer, Problem> probMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfProb = Integer.parseInt(br.readLine());
        while (numOfProb-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            addProblem(st);
        }

        int numOfComm = Integer.parseInt(br.readLine());
        while (numOfComm-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "recommend":
                    if (st.nextToken().equals("-1")) {  // 가장 쉬운 문제
                        sb.append(problems.first().num).append('\n');
                    } else {    // 가장 어려운 문제
                        sb.append(problems.last().num).append('\n');
                    }
                    break;
                case "add":
                    addProblem(st);
                    break;
                case "solved":
                    problems.remove(probMap.remove(Integer.parseInt(st.nextToken())));
            }
        }
        System.out.println(sb);
    }

    public static void addProblem(StringTokenizer st) {
        int num = Integer.parseInt(st.nextToken());
        Problem problem = new Problem(num, Integer.parseInt(st.nextToken()));
        problems.add(problem);
        probMap.put(num, problem);
    }
}
