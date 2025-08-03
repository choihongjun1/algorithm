package baekjoon.bronze.no2810;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String seat = br.readLine();
        int couple = 0;
        for(int i = 0; i < seat.length(); i++) {
            if(seat.charAt(i) == 'L') {
                couple++;
                i++;
            }
        }

        if(couple == 0) bw.write(n + "\n");
        else bw.write(n + 1 - couple + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
