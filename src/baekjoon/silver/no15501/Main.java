package baekjoon.silver.no15501;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            map.put(Integer.parseInt(st.nextToken()), i);
        }

        st = new StringTokenizer(br.readLine());
        int index = map.get(Integer.parseInt(st.nextToken()));
        int index2;
        for(int i = 1; i < n; i++) {
            index2 = map.get(Integer.parseInt(st.nextToken()));
            int diff = index - index2;

            if(Math.abs(diff) != 1 && Math.abs(diff) != n-1) {
                bw.write("bad puzzle");
                br.close();
                bw.flush();
                bw.close();
                return;
            }
            index = index2;
        }
        bw.write("good puzzle");

        br.close();
        bw.flush();
        bw.close();
    }
}
