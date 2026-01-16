package baekjoon.gold.no23048;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        arr[1] = 1;

        int color = 2;
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                int j = i;
                while(j <= n) {
                    if(arr[j] == 0) arr[j] = color;
                    j += i;
                }
                color++;
            }
        }

        bw.write(color-1 + "\n");
        for(int i = 1; i < n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.write(arr[n] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
