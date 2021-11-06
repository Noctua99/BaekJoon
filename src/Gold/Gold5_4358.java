package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Gold5_4358 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> trees = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int treeCount = 0;  // 입력된 나무의 수

        String tree;
        while ((tree = br.readLine()) != null) {    // 입력이 없으면 종료, Intellij에서 Ctrl + Z를 통해 EOF를 발생시킬 수 있다
            if (!trees.containsKey(tree)) {
                trees.put(tree, 1.0);
            } else {    // 이미 존재하는 나무인 경우 값만 1 증가
                trees.put(tree, trees.get(tree) + 1);
            }
            treeCount++;
        }


        for (String tempTree : trees.keySet()) {
            double value = (double) Math.round(trees.get(tempTree) / treeCount * 100 * 10000) / 10000;  // 각 종이 전체에서 차지하는 비율
            trees.put(tempTree, value);
        }
        ArrayList<String> treeList = new ArrayList<>(trees.keySet());
        Collections.sort(treeList);

        StringBuilder sb = new StringBuilder();
        for (String tempTree : treeList) {
            sb.append(tempTree).append(" ").append(String.format("%.4f", trees.get(tempTree))).append('\n');
        }
        System.out.print(sb);
    }
}
