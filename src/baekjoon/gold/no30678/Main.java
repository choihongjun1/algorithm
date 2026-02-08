package baekjoon.gold.no30678;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        map.put("0,1", "*");
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= Math.pow(5, n); i++) {
            bw.write(f(n, i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static String f(int n, int line) {
        String key = n + "," + line;
        if(map.get(key) != null) return map.get(key);

        int mod = (int)Math.pow(5, n-1);
        String space = " ".repeat(mod);
        switch(((line-1) / mod)) {
            case 0: map.put(key, space.repeat(2) + f(n-1, line) + space.repeat(2)); break;
            case 1: map.put(key, space.repeat(2) + f(n-1, line - mod) + space.repeat(2)); break;
            case 2: map.put(key, f(n-1, line - mod * 2).repeat(5)); break;
            case 3: map.put(key, space + f(n-1, line - mod * 3).repeat(3) + space); break;
            case 4: map.put(key, space + f(n-1, line - mod * 4) + space + f(n-1, line - mod * 4) + space); break;
        }

        return map.get(key);
    }
}
