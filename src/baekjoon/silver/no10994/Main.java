package baekjoon.silver.no10994;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= 4*n-3; i++) {
            bw.write(f(n, i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static String f(int n, int line) {
        if(line == 1 || line == 4*n-3) {
            return "*".repeat(4*n-3);
        }
        if(line == 2 || line == 4*n-4) {
            return "*" + " ".repeat(4*n-5) + "*";
        }
        return "* " + f(n-1, line-2) + " *";
    }
}
