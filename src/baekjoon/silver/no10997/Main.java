package baekjoon.silver.no10997;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            bw.write("*");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        for(int i = 1; i <= 4*n-1; i++) {
            bw.write(f(n, i).trim() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static String f(int n, int line) {
        if(n == 1) return "*";

        if(line == 1 || line == 4*n-1) return "*".repeat(4*n-3);
        if(line == 2) return "*" + " ".repeat(4*n-4);
        if(line == 4*n-2) return "*" + " ".repeat(4*n-5) + "*";
        if(line == 3) return "* " + f(n-1, 1) + "**";
        return "* " + f(n-1, line-2) + " *";
    }
}
