package baekjoon.bronze.no4458;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            result[i] = line.substring(0, 1).toUpperCase() + line.substring(1);
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
