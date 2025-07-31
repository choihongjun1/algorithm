package baekjoon.silver.no26258;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            x[i] = Integer.parseInt(line[0]);
            y[i] = Integer.parseInt(line[1]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] result = new int[m];
        for(int i = 0; i < m; i++) {
            double k = Double.parseDouble(br.readLine());
            result[i] = checkIncreasing(k, x, y);
        }

        for(int i = 0; i < m; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int checkIncreasing(double k, int[] x, int[] y) {
        int left = -1;
        int right = x.length;
        while(left + 1 < right) {
            int mid = (left + right) / 2;
            if(x[mid] < k) left = mid;
            else right = mid;
        }

        if(y[left] < y[right]) return 1;
        else if(y[left] > y[right]) return -1;
        else return 0;
    }
}
