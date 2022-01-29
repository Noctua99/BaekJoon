package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Gold3_21944 {
    static class Problem implements Comparable<Problem> {
        int id;
        int diff;
        int group;

        public Problem(int id, int diff, int group) {
            this.id = id;
            this.diff = diff;
            this.group = group;
        }

        @Override
        public int compareTo(Problem o) {
            if (this.diff == o.diff) {
                return this.id - o.id;
            }
            return this.diff - o.diff;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, TreeSet<Problem>> groupProb = new HashMap<>(); // recommend
        TreeSet<Problem> allProb = new TreeSet<>(); // recommend2, recommend3
        HashMap<Integer, Problem> idProb = new HashMap<>();    // solved

        int numOfProb = Integer.parseInt(br.readLine());
        while (numOfProb-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int diff = Integer.parseInt(st.nextToken());
            int group = Integer.parseInt(st.nextToken());
            Problem problem = new Problem(id, diff, group);

            if (!groupProb.containsKey(group)) {
                groupProb.put(group, new TreeSet<>());
            }
            groupProb.get(group).add(problem);
            allProb.add(problem);
            idProb.put(id, problem);
        }

        int numOfComm = Integer.parseInt(br.readLine());
        while (numOfComm-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "recommend":
                    int group = Integer.parseInt(st.nextToken());
                    if (st.nextToken().equals("1")) {
                        sb.append(groupProb.get(group).last().id).append('\n');
                    } else {
                        sb.append(groupProb.get(group).first().id).append('\n');
                    }
                    break;
                case "recommend2":
                    if (st.nextToken().equals("1")) {
                        sb.append(allProb.last().id).append('\n');
                    } else {
                        sb.append(allProb.first().id).append('\n');
                    }
                    break;
                case "recommend3":
                    try {
                        if (st.nextToken().equals("1")) {
                            sb.append(allProb.ceiling(new Problem(0, Integer.parseInt(st.nextToken()), 0)).id).append('\n');
                        } else {
                            sb.append(allProb.floor(new Problem(0, Integer.parseInt(st.nextToken()), 0)).id).append('\n');
                        }
                    } catch (Exception e) {
                        sb.append("-1\n");
                    }
                    break;
                case "add":
                    int id = Integer.parseInt(st.nextToken());
                    int diff = Integer.parseInt(st.nextToken());
                    group = Integer.parseInt(st.nextToken());
                    Problem problem = new Problem(id, diff, group);

                    if (!groupProb.containsKey(group)) {
                        groupProb.put(group, new TreeSet<>());
                    }
                    groupProb.get(group).add(problem);
                    allProb.add(problem);
                    idProb.put(id, problem);
                    break;
                case "solved":
                    Problem solvedProb = idProb.remove(Integer.parseInt(st.nextToken()));
                    for (TreeSet<Problem> set : groupProb.values()) {
                        if (set.contains(solvedProb)) {
                            set.remove(solvedProb);
                            break;
                        }
                    }
                    allProb.remove(solvedProb);
            }
        }
        System.out.println(sb);
    }
}
