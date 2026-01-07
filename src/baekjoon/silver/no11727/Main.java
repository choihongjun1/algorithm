package baekjoon.silver.no11727;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        if(n == 1) {
            bw.write(1 + "\n");

            br.close();
            bw.flush();
            bw.close();
            return;
        } else if(n == 2) {
            bw.write(3 + "\n");

            br.close();
            bw.flush();
            bw.close();
            return;
        }

        arr[1] = 1;
        arr[2] = 3;
        for(int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + 2 * arr[i-2];
            arr[i] %= 10007;
        }

        bw.write(arr[n] % 10007 + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}

