package baekjoon.bronze.no1100;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean[][] board = new boolean[8][8];
        for(int i = 0; i < 8; i++) {
            String line = br.readLine();
            for(int j = 0; j < 8; j++) {
                board[i][j] = line.charAt(j) == 'F';
            }
        }

        int count = 0;
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[i][j]) {
                    if(i % 2 == 0 && j % 2 == 0) count++;
                    else if(i % 2 == 1 && j % 2 == 1) count++;
                }
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
