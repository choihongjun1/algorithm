package baekjoon.silver.no2622;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int max = n % 2 == 0 ? n / 2 - 1 : n / 2;
        int count = 0;
        for(int i = max; i >= 1; i--) {
            int sum = n - i;
            if(sum > i * 2) break;
            count += Math.min(sum-1, i) - (sum/2 + sum%2) + 1;
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
