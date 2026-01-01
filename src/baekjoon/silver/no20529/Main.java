package baekjoon.silver.no20529;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n > 32) {
                sb.append(0).append("\n");
                br.readLine();
                continue;
            }

            int min = Integer.MAX_VALUE;
            String[] mbti = new String[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                mbti[j] = st.nextToken();
            }

            for(int x = 0; x < n-2; x++) {
                for(int y = x+1; y < n-1; y++) {
                    for(int z = y+1; z < n; z++) {
                        int d = distance(mbti[x], mbti[y], mbti[z]);
                        if(d < min) min = d;
                    }
                }
            }

            sb.append(min).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static int distance(String a, String b, String c) {
        return distance(a, b) + distance(b, c) + distance(a, c);
    }

    public static int distance(String a, String b) {
        String key = a.compareTo(b) <= 0 ? a + b : b + a;
        if(map.get(key) != null) return map.get(key);

        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) count++;
        }
        map.put(key, count);
        return map.get(key);
    }

}
