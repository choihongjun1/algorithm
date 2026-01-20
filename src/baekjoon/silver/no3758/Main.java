package baekjoon.silver.no3758;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int team = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int myTeam = Integer.parseInt(st.nextToken());
            int log = Integer.parseInt(st.nextToken());

            int[][] scores = new int[team][k];
            int[][] result = new int[team][4]; // id, 점수, 제출 수, 마지막 제출

            for(int j = 1; j <= team; j++) {
                result[j-1][0] = j;
            }

            for(int j = 0; j < log; j++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken()) - 1;
                int num = Integer.parseInt(st.nextToken()) - 1;
                int score = Integer.parseInt(st.nextToken());

                if(scores[id][num] < score) scores[id][num] = score;
                result[id][2]++;
                result[id][3] = j;
            }

            for(int j = 0; j < team; j++) {
                for(int l = 0; l < k; l++) {
                    result[j][1] += scores[j][l];
                }
            }

            Arrays.sort(result, (a, b) -> {
                if(a[1] != b[1]) return b[1] - a[1];
                if(a[2] != b[2]) return a[2] - b[2];
                return a[3] - b[3];
            });

            for(int j = 0; j < team; j++) {
                if(result[j][0] == myTeam) bw.write(j+1 + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
