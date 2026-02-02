package baekjoon.silver.no17413;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean tag = false;
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        String s = br.readLine();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                if(tag) sb.append(' ');
                else sb.append(reverse.reverse()).append(' ');
                reverse.setLength(0);
            }
            else if(c == '<') {
                sb.append(reverse.reverse());
                sb.append('<');
                tag = true;
                reverse.setLength(0);
            }
            else if(c == '>') {
                sb.append('>');
                tag = false;
            }
            else {
                if(tag) sb.append(c);
                else reverse.append(c);
            }
        }
        sb.append(reverse.reverse());

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
