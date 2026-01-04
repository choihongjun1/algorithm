package baekjoon.bronze.no2920;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        if(s.equals("1 2 3 4 5 6 7 8")) {
            bw.write("ascending");
        } else if(s.equals("8 7 6 5 4 3 2 1")) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
