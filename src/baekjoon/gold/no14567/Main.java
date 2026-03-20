package baekjoon.gold.no14567;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<Integer>[] adj;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        adj = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) adj[i] = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
        }

        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++) {
            if(arr[i] == 0) arr[i] = 1;
            for(int j : adj[i]) {
                arr[j] = Math.max(arr[j], arr[i]+1);
            }
        }

        for(int i = 1; i < n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.write(arr[n] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
