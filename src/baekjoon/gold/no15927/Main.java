package baekjoon.gold.no15927;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int l = s.length();
        boolean palindrome = true;
        boolean oneChar = true;
        char prev = s.charAt(0);
        for(int i = 0; i <= l/2; i++) {
            char c = s.charAt(i);
            if(c != s.charAt(l-1-i)) {
                palindrome = false;
                break;
            }
            if(prev != c) {
                oneChar = false;
            }
            prev = c;
        }

        if(!palindrome) {
            bw.write(l + "\n");
        } else if(oneChar) {
            bw.write("-1\n");
        } else {
            bw.write(l-1 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
