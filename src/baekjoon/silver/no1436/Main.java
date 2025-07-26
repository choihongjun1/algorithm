package baekjoon.silver.no1436;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int titleNumber = 666;

        while(n != 0) {
            if(String.valueOf(titleNumber).contains("666")) n--;
            titleNumber++;
        }

        bw.write(String.valueOf(titleNumber-1));

        bw.flush();
        bw.close();
        br.close();
    }
}
