package baekjoon.silver.no12891;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int A, C, G, T;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int pLen = Integer.parseInt(st.nextToken());
        String password = br.readLine();
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        int count = 0;

        String sub = password.substring(0, pLen);
        for(int j = 0; j < sub.length(); j++) {
            char dna = sub.charAt(j);
            dnaCount(dna, -1);
        }
        if(A <= 0 && C <= 0 && G <= 0 && T <= 0) count++;

        char start = sub.charAt(0);
        char end;
        for(int i = 1; i < len - pLen + 1; i++) {
            dnaCount(start, 1);
            start = password.charAt(i);
            end = password.charAt(i+pLen-1);
            dnaCount(end, -1);
            if(A <= 0 && C <= 0 && G <= 0 && T <= 0) count++;
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dnaCount(char dna, int sign) {
        switch(dna) {
            case 'A':
                A += sign;
                break;
            case 'C':
                C += sign;
                break;
            case 'G':
                G += sign;
                break;
            case 'T':
                T += sign;
        }
    }
}
