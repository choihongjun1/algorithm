package baekjoon.silver.no13413;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];
        for(int i = 0; i < t; i++) {
            int BW = 0;
            int WB = 0;
            int n = Integer.parseInt(br.readLine());
            String initial = br.readLine();
            String goal = br.readLine();
            for(int j = 0; j < n; j++) {
                if(initial.charAt(j) == 'B' && goal.charAt(j) == 'W') BW++;
                else if(initial.charAt(j) == 'W' && goal.charAt(j) == 'B') WB++;
            }
            result[i] = Math.max(BW, WB);
        }

        for(int i : result) bw.write(i + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
