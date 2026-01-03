package baekjoon.silver.no27466;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] vowel = new boolean[26];

    public static void main(String[] args) throws IOException {
        vowel[0] = true;
        vowel[4] = true;
        vowel[8] = true;
        vowel[14] = true;
        vowel[20] = true;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        String name = "";

        int index = n-1;
        while(index >= 3) {
            char c = s.charAt(index);
            if(!vowel[c-'A']) {
                name = c + name;
                index--;
                break;
            }
            index--;
        }

        while(index >= 2) {
            char c = s.charAt(index);
            if(c == 'A') {
                name = c + name;
                index--;
                break;
            }
            index--;
        }

        while(index >= 1) {
            char c = s.charAt(index);
            if(c == 'A') {
                name = c + name;
                index--;
                break;
            }
            index--;
        }

        if(index >= l-4) name = s.substring(0, l-3) + name;

        if(name.length() < l) {
            bw.write("NO\n");
        } else {
            bw.write("YES\n");
            bw.write(name);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
