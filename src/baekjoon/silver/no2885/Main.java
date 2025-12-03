package baekjoon.silver.no2885;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(br.readLine());
        int n = 1;
        while(k > n) {
            n *= 2;
        }

        if(n == k) {
            System.out.println(n + " 0");
            return;
        }

        int count = 0;
        for(int i = n/2; i >= 1 && k != 0; i/=2) {
            k %= i;
            count++;
        }

        bw.write(n + " " + count);

        bw.flush();
        bw.close();
        br.close();
    }
}
