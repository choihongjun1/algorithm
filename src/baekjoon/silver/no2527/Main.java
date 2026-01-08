package baekjoon.silver.no2527;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        for(int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x3 = Integer.parseInt(st.nextToken());
            int y3 = Integer.parseInt(st.nextToken());
            int x4 = Integer.parseInt(st.nextToken());
            int y4 = Integer.parseInt(st.nextToken());
            bw.write(check(x1, y1, x2, y2, x3, y3, x4, y4) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static char check(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        if(x2 < x3 || x4 < x1) return 'd';
        if(y2 < y3 || y4 < y1) return 'd';

        if(x2 == x3 && y2 == y3) return 'c';
        if(x2 == x3 && y1 == y4) return 'c';
        if(x1 == x4 && y1 == y4) return 'c';
        if(x1 == x4 && y2 == y3) return 'c';

        if(x2 == x3 || x1 == x4) return 'b';
        if(y2 == y3 || y1 == y4) return 'b';

        return 'a';
    }
}
