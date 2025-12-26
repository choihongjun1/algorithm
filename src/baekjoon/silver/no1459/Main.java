package baekjoon.silver.no1459;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int minXY = Math.min(x, y);
        int maxXY = Math.max(x, y);
        int line = maxXY - minXY;
        long lineTime = (long)(line / 2) * Math.min(2*w, 2*s) + (line % 2) * w;
        int diagTime = Math.min(2*w, s);

        bw.write((long)diagTime * minXY + lineTime + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
