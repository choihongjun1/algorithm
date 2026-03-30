package baekjoon.bronze.no6840;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        bw.write(arr[1] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
