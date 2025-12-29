package baekjoon.silver.no5426;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        StringBuilder[] input = new StringBuilder[t];
        StringBuilder[] output = new StringBuilder[t];

        for(int i = 0; i < t; i++) {
            input[i] = new StringBuilder();
            output[i] = new StringBuilder();
            input[i].append(br.readLine());
            int n = (int)Math.sqrt(input[i].length());
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    int index = n * k - j;
                    output[i].append(input[i].charAt(index));
                }
            }
        }

        for(int i = 0; i < t; i++) {
            bw.write(output[i].toString() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
