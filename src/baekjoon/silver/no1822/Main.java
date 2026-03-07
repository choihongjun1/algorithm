package baekjoon.silver.no1822;

import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            set1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            set2.add(Integer.parseInt(st.nextToken()));
        }

        set1.removeAll(set2);
        StringBuilder sb = new StringBuilder();
        sb.append(set1.size()).append('\n');
        for(int n : set1) {
            sb.append(n).append(' ');
        }
        bw.write(sb.toString().trim());

        br.close();
        bw.flush();
        bw.close();
    }
}
