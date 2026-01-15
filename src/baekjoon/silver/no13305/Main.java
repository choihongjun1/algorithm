package baekjoon.silver.no13305;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] d, cost;
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        d = new int[n-1];
        for(int i = 0; i < n-1; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        cost = new int[n];
        for(int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(findMinCost(n-1) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static long findMinCost(int end) {
        if(end == 0) return 0;
        if(end == 1) return (long)cost[0] * d[0];

        int min = cost[0];
        int minIndex = 0;
        for(int i = 1; i < end; i++) {
            if(cost[i] < min) {
                min = cost[i];
                minIndex = i;
            }
        }

        long c = 0;
        for(int i = minIndex; i < end; i++) {
            c += (long)min * d[i];
        }
        c += findMinCost(minIndex);
        return c;
    }
}
