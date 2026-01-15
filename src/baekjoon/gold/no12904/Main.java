package baekjoon.gold.no12904;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s1 = br.readLine();
        String s2 = br.readLine();

        int reverse = 0;
        int start = 0;
        int end = s2.length()-1;
        for(int i = 0; i < s2.length() - s1.length(); i++) {
            if(reverse % 2 == 0) {
                if(s2.charAt(end) == 'B') reverse++;
                end--;
            } else {
                if(s2.charAt(start) == 'B') reverse++;
                start++;
            }
        }

        if(reverse % 2 == 0) {
            if(s1.equals(s2.substring(start, end+1))) bw.write("1");
            else bw.write("0");
        } else {
            if(s1.equals(new StringBuilder(s2.substring(start, end+1)).reverse().toString())) bw.write("1");
            else bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
