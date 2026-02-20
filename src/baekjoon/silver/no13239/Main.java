package baekjoon.silver.no13239;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, Long> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            bw.write(combination(n, k) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static long combination(int n, int k) {
        if(n == k || k == 0) return 1;

        String key = n + "," + k;
        if(map.get(key) != null) return map.get(key);
        map.put(key, (combination(n-1, k-1) + combination(n-1, k)) % 1000000007);
        return map.get(key);
    }
}
