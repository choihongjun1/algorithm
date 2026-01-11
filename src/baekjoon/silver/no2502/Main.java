package baekjoon.silver.no2502;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] fibo = new int[d];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        int a = 1;
        int b;
        while(true) {
            if((k - a * fibo[d-2]) % fibo[d-1] == 0) {
                b = (k - a * fibo[d-2]) / fibo[d-1];
                break;
            }
            a++;
        }

        bw.write(a + "\n");
        bw.write(b + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
