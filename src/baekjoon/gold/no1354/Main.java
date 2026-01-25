package baekjoon.gold.no1354;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<Long, Long> map = new HashMap<>();
    static int p, q, x, y;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        map.put(0L, 1L);
        bw.write(f(n) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static long f(long n) {
        if(map.get(n) == null) {
            if(n < 0) map.put(n, 1L);
            else map.put(n, f(n/p - x) + f(n/q - y));
        }
        return map.get(n);
    }
}
