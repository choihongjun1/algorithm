package baekjoon.bronze.no10989;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] arr = new int[100001];
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) bw.write(i + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
