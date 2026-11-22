package baekjoon.gold.no13398;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int max = arr[0];
        int[] d0 = new int[n];
        int[] d1 = new int[n];
        d0[0] = arr[0];
        for(int i = 1; i < n; i++) {
            d0[i] = Math.max(d0[i-1] + arr[i], arr[i]);
            if(i == 1) d1[i] = d0[i-1];
            else d1[i] = Math.max(d0[i-1], d1[i-1] + arr[i]);
            max = Math.max(max, Math.max(d0[i], d1[i]));
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
