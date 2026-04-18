package baekjoon.silver.no11723;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean[] set = new boolean[21];
        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if(op.equals("all")) {
                for(int j = 1; j < set.length; j++) set[j] = true;
            } else if(op.equals("empty")) {
                for(int j = 0; j < set.length; j++) set[j] = false;
            } else if(op.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = true;
            } else if(op.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = false;
            } else if(op.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if(set[x]) bw.write("1\n");
                else bw.write("0\n");
            } else if(op.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = !set[x];
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
