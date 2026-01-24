package baekjoon.silver.no13414;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for(int i = 0; i < l; i++) {
            String sid = br.readLine();
            set.remove(sid);
            set.add(sid);
        }

        for(String sid : set) {
            bw.write(sid + "\n");
            if(--n == 0) break;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
