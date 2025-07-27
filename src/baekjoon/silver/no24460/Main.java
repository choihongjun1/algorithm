package baekjoon.silver.no24460;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        bw.write(String.valueOf(findWinner(n, arr)));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int findWinner(int n, int[][] arr) {
        if(n == 1) return arr[0][0];

        int[][] subArr1 = new int[n/2][n/2];
        int[][] subArr2 = new int[n/2][n/2];
        int[][] subArr3 = new int[n/2][n/2];
        int[][] subArr4 = new int[n/2][n/2];
        for(int i = 0; i < n/2; i++) {
            for(int j = 0; j < n/2; j++) {
                subArr1[i][j] = arr[i][j];
                subArr2[i][j] = arr[i][j+n/2];
                subArr3[i][j] = arr[i+n/2][j];
                subArr4[i][j] = arr[i+n/2][j+n/2];
            }
        }
        int[] sort = {findWinner(n/2, subArr1), findWinner(n/2, subArr2), findWinner(n/2, subArr3), findWinner(n/2, subArr4)};
        Arrays.sort(sort);
        return sort[1];
    }
}
