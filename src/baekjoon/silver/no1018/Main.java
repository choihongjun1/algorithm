package baekjoon.silver.no1018;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] size = br.readLine().split(" ");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);
        char[][] board = new char[row][col];

        // 보드 초기화
        for(int i = 0; i < row; i++) {
            String line = br.readLine();
            for(int j = 0; j < col; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int min = row * col;
        for(int i = 0; i < row - 7; i++) {
            for(int j = 0; j < col - 7; j++) {
                int repaintCount = findRepaintCount(board, i, j);
                if(min > repaintCount) min = repaintCount;
            }
        }

        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int findRepaintCount(char[][] board, int row, int col) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[row+i][col+j] != (((i+j) % 2 == 0) ? 'B' : 'W')) count1++;
                else count2++;
            }
        }
        return Math.min(count1, count2);
    }
}
