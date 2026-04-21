package baekjoon.silver.no11659;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        arr[1] = Integer.parseInt(st.nextToken());
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(arr[b] - arr[a-1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
