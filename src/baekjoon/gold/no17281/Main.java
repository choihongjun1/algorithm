package baekjoon.gold.no17281;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] order = new int[9];
    static boolean[] visited = new boolean[10];
    static int max = 0;
    static int[][] hit;
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine()); // 이닝
        hit = new int[n][9];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                hit[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        order[3] = 1;
        visited[1] = true;
        bt(0);

        bw.write(max + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bt(int count) throws IOException {
        if(count == 3) {
            bt(count + 1);
            return;
        }

        if(count == 9) {
            int score = play();
            if(score > max) max = score;
            return;
        }

        for(int i = 2; i <= 9; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            order[count] = i;
            bt(count+1);
            visited[i] = false;
        }
    }

    public static int play() {
        int score = 0;
        int inning = 1;
        int index = 0;
        int out = 0;
        int[] base = new int[3];

        while(inning <= n) {
            int batting = hit[inning-1][order[index]-1];

            if(batting == 0) out++;
            else if(batting == 1) {
                score += base[2];
                base[2] = base[1];
                base[1] = base[0];
                base[0] = 1;
            }
            else if(batting == 2) {
                score += base[2] + base[1];
                base[2] = base[0];
                base[1] = 1;
                base[0] = 0;
            }
            else if(batting == 3) {
                score += base[2] + base[1] + base[0];
                base[2] = 1;
                base[1] = 0;
                base[0] = 0;
            }
            else if(batting == 4) {
                score += base[2] + base[1] + base[0] + 1;
                base[2] = 0;
                base[1] = 0;
                base[0] = 0;
            }

            index++;
            index %= 9;

            if(out == 3) {
                inning++;
                base[0] = 0;
                base[1] = 0;
                base[2] = 0;
                out = 0;
            }
        }

        return score;
    }
}
