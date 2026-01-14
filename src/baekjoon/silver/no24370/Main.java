package baekjoon.silver.no24370;

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
        st = new StringTokenizer(br.readLine());
        int c1 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        int n0 = Integer.parseInt(br.readLine());

        if(bigO(a1, a2, a3, c2, n0) && bigOmega(a1, a2, a3, c1, n0)) bw.write("1");
        else bw.write("0");

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean bigO(int a1, int a2, int a3, int c, int n0) {
        if(c < a1) return false;
        else if(c == a1) return a2 <= 0 && a2 * n0 + a3 <= 0;
        else {
            double d = a2*a2 + 4*(c-a1)*a3;
            if(d <= 0) return true;
            else return c * n0 * n0 >= a1 * n0 * n0 + a2 * n0 + a3 && n0 * 2 * (c - a1) > a2;
        }
    }

    public static boolean bigOmega(int a1, int a2, int a3, int c, int n0) {
        if(c > a1) return false;
        else if(c == a1) return a2 >= 0 && a2 * n0 + a3 >= 0;
        else {
            double d = a2*a2 + 4*(c-a1)*a3;
            if(d <= 0) return true;
            else return c * n0 * n0 <= a1 * n0 * n0 + a2 * n0 + a3 && n0 * 2 * (c - a1) < a2;
        }
    }
}
