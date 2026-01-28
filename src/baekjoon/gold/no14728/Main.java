package baekjoon.gold.no14728;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());
        int[] arr = new int[time+1];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            for(int j = time; j >= t; j--) {
                arr[j] = Math.max(arr[j], arr[j-t] + s);
            }
        }

        bw.write(arr[time] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
