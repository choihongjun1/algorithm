package baekjoon.platinum.no1786;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String t = br.readLine();
        String p = br.readLine();

        List<Integer> kmp = kmp(t, p);
        StringBuilder sb = new StringBuilder();
        sb.append(kmp.size()).append('\n');
        for(int i = 0; i < kmp.size(); i++) {
            sb.append(kmp.get(i)).append(' ');
        }
        bw.write(sb.toString().trim());

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

    public static List<Integer> kmp(String t, String p) {
        List<Integer> result = new ArrayList<>();
        int[] failure = getFailure(p);
        int j = 0;
        for(int i = 0; i < t.length(); i++) {
            while(j > 0 && t.charAt(i) != p.charAt(j)) {
                j = failure[j-1];
            }

            if(t.charAt(i) == p.charAt(j)) {
                j++;
            }

            if(j == p.length()) {
                result.add(i-p.length()+2);
                j = failure[j-1];
            }
        }

        return result;
    }
}
