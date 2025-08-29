package baekjoon.bronze.no17614;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int clap = 0;
        for(int i = 1; i <= n; i++) {
            String num = String.valueOf(i);
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') clap++;
            }
        }

        bw.write(clap + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
