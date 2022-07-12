package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gold5_3156 {

    static class Song {
        final String title;
        final int minRank;

        public Song(String title, int minRank) {
            this.title = title;
            this.minRank = minRank;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> hashMap = new HashMap<>();
        int[] duplicate = new int[101];
        int[] sum = new int[101];
        ArrayList<Song> songs = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());   // 진술의 수
        while (N-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            st.nextToken();
            int B = Integer.parseInt(st.nextToken());

            while (A-- > 0) {
                String title = st.nextToken();

                if (hashMap.containsKey(title)) {
                    hashMap.put(title, Math.min(hashMap.get(title), B));
                } else {
                    hashMap.put(title, B);
                }
            }
        }

        for (int value : hashMap.values()) {
            duplicate[value]++;
        }

        for (int i = 1; i <= 100; i++) {
            sum[i] = sum[i - 1] + duplicate[i];
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (duplicate[entry.getValue()] == 1 && sum[entry.getValue()] == entry.getValue()) {
                songs.add(new Song(
                        entry.getKey(),
                        entry.getValue()
                ));
            }
        }

        songs.stream().sorted(Comparator.comparing(o -> o.minRank))
                .forEach(o -> sb.append(o.minRank).append(" ").append(o.title).append("\n"));

        System.out.println(sb);
    }
}
