package baekjoon.gold.no2448;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        map.put("3,1", "*");
        map.put("3,2", "* *");
        map.put("3,3", "*****");

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            bw.write(" ".repeat(n-i) + f(n, i) + " ".repeat(n-i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static String f(int n, int line) {
        String key = n + "," + line;
        if(map.get(key) != null) return map.get(n + "," + line);

        if(line <= n/2) map.put(key, f(n/2, line));
        else map.put(key, f(n/2, line - n/2) + " ".repeat(2 * (n-line) + 1) + f(n/2, line - n/2));

        return map.get(key);
    }
}
