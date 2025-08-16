package baekjoon.bronze.no2163;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        bw.write(cleave(n, m) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int cleave(int n, int m) {
        if(n == 1 && m == 1) return 0;
        int larger = Math.max(n, m);
        int smaller = Math.min(n, m);
        if(larger % 2 == 1) return 1 + cleave(larger / 2, smaller) + cleave(larger / 2 + 1, smaller);
        else return 1 + 2 * cleave(larger/ 2, smaller);
    }
}
