package baekjoon.bronze.no10262;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] gunnar = br.readLine().split(" ");
        String[] emma = br.readLine().split(" ");

        int E1 = 0;
        int E2 = 0;
        for(int i = 0; i < 4; i++) {
            E1 += Integer.parseInt(gunnar[i]);
            E2 += Integer.parseInt(emma[i]);
        }

        if(E1 > E2) bw.write("Gunnar\n");
        else if(E1 < E2) bw.write("Emma\n");
        else bw.write("Tie\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
