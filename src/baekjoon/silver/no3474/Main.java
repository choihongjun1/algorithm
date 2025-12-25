package baekjoon.silver.no3474;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            result[i] = Math.min(countk(n, 2), countk(n, 5));
        }

        for(int i = 0; i < t; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int countk(int n, int k) {
        int count = 0;
        int num = k;
        while(num <= n) {
            count += n / num;
            num *= k;
        }
        return count;
    }
}
