package baekjoon.gold.no12865;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[k+1];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            for(int j = k; j >= w; j--) {
                arr[j] = Math.max(arr[j], arr[j-w] + v);
            }
        }

        bw.write(arr[k] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
