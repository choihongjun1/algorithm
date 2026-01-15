package baekjoon.silver.no20937;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int prev = arr[0];
        int max = 1;
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] != prev) {
                count = 1;
            } else {
                count++;
                if(max < count) max = count;
            }
            prev = arr[i];
        }

        bw.write(max + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
