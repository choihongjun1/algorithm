package baekjoon.silver.no1620;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++) {
            String name = br.readLine();
            map1.put(name, i);
            map2.put(i, name);
        }

        for(int i = 0; i < m; i++) {
            String s = br.readLine();
            if(s.charAt(0) >= '1' && s.charAt(0) <= '9') {
                bw.write(map2.get(Integer.parseInt(s)) + "\n");
            } else {
                bw.write(map1.get(s) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
