package baekjoon.silver.no26069;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Map<String, Boolean> map = new HashMap<>();
        map.put("ChongChong", true);
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(map.get(a) == null && map.get(b) == null) continue;
            else if(map.get(a) == null) map.put(a, true);
            else map.put(b, true);
        }

        bw.write(map.size() + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
