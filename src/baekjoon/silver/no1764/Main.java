package baekjoon.silver.no1764;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set1.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            set2.add(br.readLine());
        }

        set1.retainAll(set2);
        List<String> result = new ArrayList<>(set1);
        Collections.sort(result);

        bw.write(set1.size() + "\n");
        for(String name : result) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
