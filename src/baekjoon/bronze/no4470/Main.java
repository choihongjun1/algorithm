package baekjoon.bronze.no4470;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];
        for(int i = 1; i <= n; i++) {
            result[i-1] = i + ". " + br.readLine();
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
