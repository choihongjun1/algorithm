package baekjoon.silver.no11497;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int prev = arr[0];
            int max = 0;
            int diff;
            for(int j = 2; j < n; j+=2) {
                diff = arr[j] - prev;
                if(diff > max) max = diff;
                prev = arr[j];
            }

            prev = arr[1];
            for(int j = 3; j < n; j+=2) {
                diff = arr[j] - prev;
                if(diff > max) max = diff;
                prev = arr[j];
            }

            if(arr[n-1] - arr[n-2] > max) max = arr[n-1] - arr[n-2];
            if(arr[1] - arr[0] > max) max = arr[1] - arr[0];

            bw.write(max + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
