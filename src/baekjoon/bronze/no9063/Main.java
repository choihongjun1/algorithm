package baekjoon.bronze.no9063;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int xMax = -10000;
        int yMax = -10000;
        int xMin = 10000;
        int yMin = 10000;

        for(int i = 1; i <= n; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            if(xMax < x) xMax = x;
            if(yMax < y) yMax = y;
            if(xMin > x) xMin = x;
            if(yMin > y) yMin = y;
        }

        bw.write(String.valueOf((xMax - xMin) * (yMax - yMin) ));

        bw.flush();
        bw.close();
        br.close();
    }
}
