package baekjoon.silver.no5107;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int test = 1;
        int n = Integer.parseInt(br.readLine());
        while(n != 0) {
            Map<String, String> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                map.put(st.nextToken(), st.nextToken());
            }

            int chain = 0;
            while(!map.isEmpty()) {
                String start = map.keySet().iterator().next();
                String manito = map.get(start);
                while(!manito.equals(start)) {
                    String temp = map.get(manito);
                    map.remove(manito);
                    manito = temp;
                }
                map.remove(start);
                chain++;
            }
            bw.write(test + " " + chain + "\n");

            n = Integer.parseInt(br.readLine());
            test++;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
