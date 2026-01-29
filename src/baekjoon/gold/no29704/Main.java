package baekjoon.gold.no29704;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int fine = 0;
        int[] arr = new int[t+1];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            fine += m;
            for(int j = t; j >= d; j--) {
                arr[j] = Math.max(arr[j], arr[j-d] + m);
            }
        }
        bw.write(fine - arr[t] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
