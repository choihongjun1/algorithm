package baekjoon.silver.no1010;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            result[i] = combination(m, n);
        }

        for (int i = 0; i < t; i++) {
            bw.write(result[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int combination(int n, int k) {
        if(n == k || k == 0) return 1;

        String key1 = n-1 + "," + (k-1);
        String key2 = n-1 + "," + k;

        if(map.get(key1) == null) map.put(key1, combination(n-1, k-1));
        if(map.get(key2) == null) map.put(key2, combination(n-1, k));
        return map.get(key1) + map.get(key2);
    }

}
