package baekjoon.gold.no14503;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        boolean[][] clean = new boolean[n][m];
        boolean[][] wall = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                wall[i][j] = st.nextToken().equals("1");
            }
        }

        int count = 0;
        int rotation = 0;
        int rNext;
        int cNext;
        while(true) {
            if(!clean[r][c]) {
                clean[r][c] = true;
                count++;
            }

            if(rotation == 4) {
                d = (d + 2) % 4;
                r = r + (d - 1) * (1 - (d % 2));
                c = c + (2 - d) * (d % 2);
                if(wall[r][c]) {
                    break;
                } else {
                    d = (d + 2) % 4;
                }
                rotation = 0;
            }

            d = d == 0 ? 3 : d-1;
            rNext = r + (d - 1) * (1 - (d % 2));
            cNext = c + (2 - d) * (d % 2);
            if(wall[rNext][cNext] || clean[rNext][cNext]) {
                rotation++;
            } else {
                r = rNext;
                c = cNext;
                rotation = 0;
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
