package baekjoon.silver.no24315;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c1 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        int n0 = Integer.parseInt(br.readLine());

        if(c1 <= a && a <= c2 && c1*n0 <= a*n0+b && a*n0+b <= c2*n0) bw.write("1");
        else bw.write("0");

        br.close();
        bw.flush();
        bw.close();
    }
}
