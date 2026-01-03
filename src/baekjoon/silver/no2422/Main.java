package baekjoon.silver.no2422;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Map<String, Boolean> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n < 3) {
            bw.write("0");
            return;
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map.put(Math.min(x, y) + "," + Math.max(x, y), true);
        }

        int count = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = i+1; j <= n; j++) {
                if(map.get(i + "," + j) != null) continue;
                for(int k = j+1; k <= n; k++) {
                    if(map.get(i + "," + k) != null || map.get(j + "," + k) != null) continue;
                    count++;
                }
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
