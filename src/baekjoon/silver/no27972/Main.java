package baekjoon.silver.no27972;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] sheetMusic = br.readLine().split(" ");
        int increase = 0;
        int decrease = 0;
        int max = 0;
        for(int i = 0; i < n-1; i++) {
            if(Integer.parseInt(sheetMusic[i]) < Integer.parseInt(sheetMusic[i+1])) {
                increase++;
                decrease = 0;
                if(increase > max) max = increase;
            } else if(Integer.parseInt(sheetMusic[i]) > Integer.parseInt(sheetMusic[i+1])) {
                decrease++;
                increase = 0;
                if(decrease > max) max = decrease;
            }
        }

        bw.write(max + 1 + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
