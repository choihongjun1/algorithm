package baekjoon.silver.no20312;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long rowSum = Long.parseLong(st.nextToken());
        long sum = rowSum;
        for(int i = 1; i < n-1; i++) {
            long diff = Long.parseLong(st.nextToken());
            rowSum = rowSum * diff + diff;
            rowSum %= 1000000007;
            sum = (sum + rowSum) % 1000000007;
        }

        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
