package baekjoon.silver.no24368;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int a3 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if(c < a1) bw.write("0");
        else if(c == a1) {
            if(a2 <= 0 && a2*n0+a3 <= 0) bw.write("1");
            else bw.write("0");
        } else {
            double d = a2*a2 + 4*(c-a1)*a3;
            if(d <= 0) bw.write("1");
            else {
                if(c*n0*n0 >= a1*n0*n0 + a2*n0 + a3 && n0*2*(c-a1) > a2) bw.write("1");
                else bw.write("0");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
