package baekjoon.gold.no11729;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        bw.write((int)Math.pow(2,n)-1 + "\n");
        hanoi(n, 1, 3);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void hanoi(int n, int start, int end) throws IOException {
        if(n == 1) {
            bw.write(start + " " + end + "\n");
            return;
        }
        hanoi(n-1, start, 6-start-end);
        hanoi(1, start, end);
        hanoi(n-1, 6-start-end, end);
    }
}
