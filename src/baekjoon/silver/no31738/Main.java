package baekjoon.silver.no31738;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n >= m) bw.write("0");
        else {
            long result = 1;
            for(int i = 2; i <= n; i++) {
                result *= i;
                result %= m;
            }
            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
