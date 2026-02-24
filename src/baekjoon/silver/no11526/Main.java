package baekjoon.silver.no11526;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            bw.write(k + " " + indexOf(st.nextToken()) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int indexOf(String frac) {
        String[] split = frac.split("/");
        long p = Long.parseLong(split[0]);
        long q = Long.parseLong(split[1]);

        if(p == q) return 1;

        if(map.get(frac) == null) {
            if(p < q) map.put(frac, indexOf(p + "/" + (q-p)) * 2);
            else map.put(frac, indexOf(p-q + "/" + q) * 2 + 1);;
        }
        return map.get(frac);
    }
}
