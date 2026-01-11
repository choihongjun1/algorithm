package baekjoon.silver.no1063;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String king = st.nextToken();
        String stone = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int r1 = '8'-king.charAt(1);
        int c1 = king.charAt(0)-'A';
        int r2 = '8'-stone.charAt(1);
        int c2 = stone.charAt(0)-'A';
        for(int i = 0; i < n; i++) {
            String move = br.readLine();
            boolean b1, b2;
            if(move.equals("R")) {
                b1 = c1 < 7;
                b2 = c2 < 7;
                if(b1 && (b2 || r1 != r2 || c1+1 != c2)) {
                    c1++;
                    if(r1 == r2 && c1 == c2) c2++;
                }
            } else if(move.equals("L")) {
                b1 = c1 > 0;
                b2 = c2 > 0;
                if(b1 && (b2 || r1 != r2 || c1-1 != c2)) {
                    c1--;
                    if(r1 == r2 && c1 == c2) c2--;
                }
            } else if(move.equals("B")) {
                b1 = r1 < 7;
                b2 = r2 < 7;
                if(b1 && (b2 || c1 != c2 || r1+1 != r2)) {
                    r1++;
                    if(r1 == r2 && c1 == c2) r2++;
                }
            } else if(move.equals("T")) {
                b1 = r1 > 0;
                b2 = r2 > 0;
                if(b1 && (b2 || c1 != c2 || r1-1 != r2)) {
                    r1--;
                    if(r1 == r2 && c1 == c2) r2--;
                }
            } else if(move.equals("RT")) {
                b1 = c1 < 7 && r1 > 0;
                b2 = c2 < 7 && r2 > 0;
                if(b1 && (b2 || c1+1 != c2 || r1-1 != r2)) {
                    c1++;
                    r1--;
                    if(r1 == r2 && c1 == c2) {
                        c2++;
                        r2--;
                    }
                }
            } else if(move.equals("LT")) {
                b1 = c1 > 0 && r1 > 0;
                b2 = c2 > 0 && r2 > 0;
                if(b1 && (b2 || c1-1 != c2 || r1-1 != r2)) {
                    c1--;
                    r1--;
                    if(r1 == r2 && c1 == c2) {
                        c2--;
                        r2--;
                    }
                }
            } else if(move.equals("RB")) {
                b1 = c1 < 7 && r1 < 7;
                b2 = c2 < 7 && r2 < 7;
                if(b1 && (b2 || c1+1 != c2 || r1+1 != r2)) {
                    c1++;
                    r1++;
                    if(r1 == r2 && c1 == c2) {
                        c2++;
                        r2++;
                    }
                }
            } else if(move.equals("LB")) {
                b1 = c1 > 0 && r1 < 7;
                b2 = c2 > 0 && r2 < 7;
                if(b1 && (b2 || c1-1 != c2 || r1+1 != r2)) {
                    c1--;
                    r1++;
                    if(r1 == r2 && c1 == c2) {
                        c2--;
                        r2++;
                    }
                }
            }
        }

        bw.write((char)('A'+c1) + String.valueOf(8-r1) + "\n");
        bw.write((char)('A'+c2) + String.valueOf(8-r2) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
