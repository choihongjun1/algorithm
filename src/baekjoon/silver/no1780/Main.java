package baekjoon.silver.no1780;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] result = f(n, arr);
        for(int i = 0; i < result.length; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int[] f(int n, int[][] arr) {
        int[] result = new int[3];
        if(n == 1) {
            result[arr[0][0]+1] = 1;
            return result;
        }

        List<int[][]> list = new ArrayList<>();
        for(int i = 0; i < 9; i++) list.add(new int[n/3][n/3]);

        boolean b = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[0][0] != arr[i][j]) b = false;

                int index = (i / (n/3)) * 3 + (j / (n/3));
                list.get(index)[i % (n/3)][j % (n/3)] = arr[i][j];
            }
        }

        if(b) {
            result[arr[0][0]+1] = 1;
            return result;
        }

        for(int i = 0; i < 9; i++) {
            int[] r = f(n/3, list.get(i));
            result[0] += r[0];
            result[1] += r[1];
            result[2] += r[2];
        }

        return result;
    }
}
