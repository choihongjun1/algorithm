package baekjoon.silver.no1535;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] l = new int[n];
        int[] j = new int[n];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            j[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr = new int[100];
        for(int i = 0; i < n; i++) {
            for(int k = 99; k >= l[i]; k--) {
                arr[k] = Math.max(arr[k], arr[k-l[i]] + j[i]);
            }
        }
        bw.write(arr[99] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
