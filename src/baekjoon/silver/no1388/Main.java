package baekjoon.silver.no1388;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[][] map;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        map = new boolean[r][c];

        for(int i = 0; i < r; i++) {
            String line = br.readLine();
            for(int j = 0; j < c; j++) {
                map[i][j] = line.charAt(j) == '-';
            }
        }

        int count = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(j > 0 && map[i][j] && map[i][j-1]) continue;
                if(i > 0 && !map[i][j] && !map[i-1][j]) continue;
                count++;
            }
        }
        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
