package baekjoon.silver.no11726;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        if(n < 3) {
            bw.write(n + "\n");

            br.close();
            bw.flush();
            bw.close();
            return;
        }

        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            arr[i] %= 10007;
        }

        bw.write(arr[n] % 10007 + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
