package baekjoon.silver.no29197;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int gcd = gcd(Math.abs(x), Math.abs(y));
            x /= gcd;
            y /= gcd;
            set.add(x + " " + y);
        }

        bw.write(set.size() + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;

        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
