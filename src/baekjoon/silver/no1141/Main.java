package baekjoon.silver.no1141;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);

        int prefix = 0;
        for(int i = 0; i < n-1; i++) {
            if(arr[i+1].length() >= arr[i].length() && arr[i+1].substring(0, arr[i].length()).equals(arr[i])) prefix++;
        }

        bw.write(n - prefix + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
