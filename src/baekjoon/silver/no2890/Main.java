package baekjoon.silver.no2890;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] n = br.readLine().split(" ");
        int r = Integer.parseInt(n[0]);
        int c = Integer.parseInt(n[1]);
        String[] line = new String[r];
        for(int i = 0; i < r; i++) {
            line[i] = br.readLine();
        }
        Arrays.sort(line);

        int[] ranks = new int[9];
        int rank = 1;
        int prev = -1;
        for(int i = r-9; i < r; i++) {
            for(int j = 1; j < c-3; j++) {
                char ch = line[i].charAt(j);
                if(ch != '.') {
                    int team = ch - '0';
                    if(prev == j) rank--;
                    ranks[team-1] = rank;
                    rank++;
                    prev = j;
                    break;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            bw.write(ranks[i] + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
