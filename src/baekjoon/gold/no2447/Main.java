package baekjoon.gold.no2447;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        map.put("3_0", "***");
        map.put("3_1", "* *");
        map.put("3_2", "***");
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            bw.write(f(n, i) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static String f(int n, int line) {
        if(n == 3) {
            return map.get(3 + "_" + line);
        }

        String key;
        int mod = line % (n/3);
        if(line < n / 3 || line >= 2 * n / 3) {
            key = n + "_" + mod;
            if(map.get(key) == null) {
                map.put(key, f(n / 3, mod).repeat(3));
            }
        } else {
            key = n + "_" + line;
            if(map.get(key) == null) {
                map.put(key, f(n / 3, mod) + " ".repeat(n / 3) + f(n / 3, mod));
            }
        }

        return map.get(key);
    }
}
