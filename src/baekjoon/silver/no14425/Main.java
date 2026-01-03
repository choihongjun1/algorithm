package baekjoon.silver.no14425;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set1 = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set1.add(br.readLine());
        }

        int intersection = 0;
        for(int i = 0; i < m; i++) {
            if(set1.contains(br.readLine())) intersection++;
        }

        bw.write(intersection + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
