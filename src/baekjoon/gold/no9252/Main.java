package baekjoon.gold.no9252;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s1 = br.readLine();
        String s2 = br.readLine();
        int[][] lcs = new int[s1.length()+1][s2.length()+1];

        for(int i = 1; i <= s1.length(); i++) {
            for(int j = 1; j <= s2.length(); j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                }
                else {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }

        bw.write(lcs[s1.length()][s2.length()] + "\n");

        StringBuilder sb = new StringBuilder();
        int i = s1.length();
        int j = s2.length();
        while(i > 0 && j > 0) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else {
                if(lcs[i-1][j] >= lcs[i][j-1]) i--;
                else j--;
            }
        }

        bw.write(sb.reverse().toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
