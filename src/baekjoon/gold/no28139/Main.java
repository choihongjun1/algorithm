package baekjoon.gold.no28139;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] x;
    static int[] y;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        x = new int[n];
        y = new int[n];
        for(int i = 0; i < n; i++) {
            String[] point = br.readLine().split(" ");
            x[i] = Integer.parseInt(point[0]);
            y[i] = Integer.parseInt(point[1]);
        }

        double sum = 0;
        for(int i = 0; i <= n-2; i++) {
            for(int j = i+1; j <= n-1; j++) {
                sum += distance(i, j);
            }
        }
        sum *= 2;
        sum /= n;

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static double distance(int i, int j) {
        return Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
    }
}
