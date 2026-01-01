package baekjoon.notratable.no18017;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = 299792458.0;
        double v = (a + b) / (1.0 + (a*b) / (c*c));
        bw.write(v + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
