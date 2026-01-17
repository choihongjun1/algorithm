package baekjoon.silver.no10799;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int h = 0;
        int bar = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                if(s.charAt(i+1) == '(') {
                    bar++;
                    h++;
                }
                else {
                    bar += h;
                    i++;
                }
            } else {
                h--;
            }
        }

        bw.write(bar + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
