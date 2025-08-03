package baekjoon.bronze.no10214;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] result = new String[t];
        for(int i = 0; i < t; i++) {
            int yonsei = 0;
            int korea = 0;
            for(int j = 0; j < 9; j++) {
                String[] score = br.readLine().split(" ");
                yonsei += Integer.parseInt(score[0]);
                korea += Integer.parseInt(score[1]);
            }
            if(yonsei > korea) result[i] = "Yonsei";
            else if(yonsei < korea) result[i] = "Korea";
            else result[i] = "Draw";
        }

        for(String s : result) bw.write(s+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
