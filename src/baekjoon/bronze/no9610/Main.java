package baekjoon.bronze.no9610;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis = 0;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            if(x > 0 && y > 0) q1++;
            else if(x < 0 && y > 0) q2++;
            else if(x < 0 && y < 0) q3++;
            else if(x > 0 && y < 0) q4++;
            else axis++;
        }

        bw.write("Q1: " + q1 + "\n");
        bw.write("Q2: " + q2 + "\n");
        bw.write("Q3: " + q3 + "\n");
        bw.write("Q4: " + q4 + "\n");
        bw.write("AXIS: " + axis + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
