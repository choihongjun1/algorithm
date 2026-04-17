package baekjoon.silver.no9375;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            Map<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                if(map.get(type) != null) {
                    map.put(type, map.get(type) + 1);
                } else {
                    map.put(type, 1);
                }
            }

            int count = 1;
            for(int v : map.values()) {
                count *= v + 1;
            }
            --count;

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
