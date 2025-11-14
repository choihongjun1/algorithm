package baekjoon.silver.no14469;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] cow = new int[n][2];
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            cow[i][0] = Integer.parseInt(line[0]);
            cow[i][1] = Integer.parseInt(line[1]);
        }
        Arrays.sort(cow, (a, b) -> a[0] - b[0]);

        int time = 0;
        for(int i = 0; i < n; i++) {
            int arrive = cow[i][0];
            int check = cow[i][1];
            if(time <= arrive) {
                time = arrive + check;
            } else {
                time = time + check;
            }
        }
        bw.write(time + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
