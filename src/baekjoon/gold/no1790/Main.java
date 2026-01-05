package baekjoon.gold.no1790;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if(k <= 9) {
            if(n >= k) bw.write(k + "\n");
            else bw.write("-1");

            br.close();
            bw.flush();
            bw.close();
            return;
        }

        long[] arr = new long[9];
        arr[0] = 9;
        int len = 0;

        for(int i = 1; i < arr.length; i++) {
            if(i == 8) arr[i] = arr[i-1] + 9;
            else arr[i] = arr[i-1] + (i+1) * 9 * (long)Math.pow(10, i);
            if(arr[i] >= k) {
                len = i+1;
                break;
            }
        }

        if(len == 0) {
            bw.write("-1");

            br.close();
            bw.flush();
            bw.close();
            return;
        }

        long r = (k - arr[len-2]);
        long num = Integer.parseInt("9".repeat(len-1)) + r / len;
        int mod = (int)(r % len);
        if(mod == 0) {
            if(num > n) bw.write("-1");
            else bw.write(String.valueOf(num).charAt(len-1));
        } else {
            if(num+1 > n) bw.write("-1");
            else bw.write(String.valueOf(num+1).charAt(mod-1));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
