package baekjoon.silver.no2630;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[n][n];
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                if(st.nextToken().equals("1")) arr[i][j] = true;
            }
        }

        st = new StringTokenizer(f(n, arr));
        bw.write(st.nextToken() + "\n");
        bw.write(st.nextToken() + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static String f(int n, boolean[][] arr) {
        if(n == 1) {
            if(arr[0][0]) return "0 1";
            else return "1 0";
        }

        boolean[][] subArr1 = new boolean[n/2][n/2];
        boolean[][] subArr2 = new boolean[n/2][n/2];
        boolean[][] subArr3 = new boolean[n/2][n/2];
        boolean[][] subArr4 = new boolean[n/2][n/2];

        boolean b = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] != arr[0][0]) b = false;

                if(i < n/2 && j < n/2) subArr1[i][j] = arr[i][j];
                else if(i < n/2 && j >= n/2) subArr2[i][j-n/2] = arr[i][j];
                else if(i >= n/2 && j < n/2) subArr3[i-n/2][j] = arr[i][j];
                else if(i >= n/2 && j >= n/2) subArr4[i-n/2][j-n/2] = arr[i][j];
            }
        }

        if(b) {
            if(arr[0][0]) return "0 1";
            else return "1 0";
        }

        int white = 0;
        int blue = 0;

        StringTokenizer st;
        st = new StringTokenizer(f(n/2, subArr1));
        white += Integer.parseInt(st.nextToken());
        blue += Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f(n/2, subArr2));
        white += Integer.parseInt(st.nextToken());
        blue += Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f(n/2, subArr3));
        white += Integer.parseInt(st.nextToken());
        blue += Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f(n/2, subArr4));
        white += Integer.parseInt(st.nextToken());
        blue += Integer.parseInt(st.nextToken());

        return white + " " + blue;
    }
}
