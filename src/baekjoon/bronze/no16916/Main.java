package baekjoon.bronze.no16916;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String t = br.readLine();
        String p = br.readLine();

        if(kmp(t, p)) bw.write("1");
        else bw.write("0");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int[] getFailure(String p) {
        int[] failure = new int[p.length()];
        int j = 0;
        for(int i = 1; i < p.length(); i++) {
            while(j > 0 && p.charAt(i) != p.charAt(j)) {
                j = failure[j-1];
            }

            if(p.charAt(i) == p.charAt(j)) {
                j++;
            }

            failure[i] = j;
        }
        return failure;
    }

    public static boolean kmp(String t, String p) {
        int[] failure = getFailure(p);
        int j = 0;
        for(int i = 0; i < t.length(); i++) {
            while(j > 0 && t.charAt(i) != p.charAt(j)) {
                j = failure[j-1];
            }

            if(t.charAt(i) == p.charAt(j)) {
                j++;
            }

            if(j == p.length()) return true;
        }

        return false;
    }
}
