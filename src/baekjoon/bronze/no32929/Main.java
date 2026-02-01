package baekjoon.bronze.no32929;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        if(x % 3 == 1) bw.write("U");
        else if(x % 3 == 2) bw.write("O");
        else bw.write("S");

        br.close();
        bw.flush();
        bw.close();
    }
}
