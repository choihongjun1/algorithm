package baekjoon.silver.no10816;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.get(num) == null) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.get(num) != null) sb.append(map.get(num)).append(" ");
            else sb.append(0).append(" ");
        }

        bw.write(sb.toString().trim());

        br.close();
        bw.flush();
        bw.close();
    }
}
