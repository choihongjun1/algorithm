package baekjoon.silver.no1813;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] arr = new int[51];
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == i) {
                bw.write(i + "\n");

                br.close();
                bw.flush();
                bw.close();
                return;
            }
        }

        bw.write("-1");

        br.close();
        bw.flush();
        bw.close();
    }
}
