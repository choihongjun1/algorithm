package baekjoon.silver.no1972;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        while(!s.equals("*")) {
            if(isSurprise(s)) bw.write(s + " is surprising.\n");
            else bw.write(s + " is NOT surprising.\n");
            s = br.readLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isSurprise(String s) {
        for(int d = 1; d < s.length(); d++) {
            Set<String> set = new HashSet<>();
            for(int i = 0; i < s.length()-d; i++) {
                if(!set.add("" + s.charAt(i) + s.charAt(i+d))) return false;
            }
        }
        return true;
    }
}
