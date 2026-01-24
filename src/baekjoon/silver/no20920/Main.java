package baekjoon.silver.no20920;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        TreeSet<String> set = new TreeSet<>(
                (o1, o2) -> {
                    int v1 = map.get(o1);
                    int v2 = map.get(o2);
                    if(v1 != v2) {
                        return v2 - v1;
                    }
                    if(o1.length() != o2.length()) {
                        return o2.length() - o1.length();
                    }
                    return o1.compareTo(o2);
                }
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            String word = br.readLine();
            if(word.length() < m) continue;

            if(map.get(word) != null) map.put(word, map.get(word) + 1);
            else map.put(word, 1);
        }

        for(String word : map.keySet()) {
            set.add(word);
        }

        for(String word : set) {
            bw.write(word + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
