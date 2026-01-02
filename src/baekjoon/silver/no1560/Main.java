package baekjoon.silver.no1560;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String n = br.readLine();
        if(n.equals("1")) bw.write("1");
        else bw.write(sub(sum(n, n), "2"));

        br.close();
        bw.flush();
        bw.close();
    }

    public static String sum(String a, String b) {
        String big = a.length() >= b.length() ? a : b;
        String small = a.length() >= b.length() ? b : a;
        int max = big.length();
        int min = small.length();
        StringBuilder result = new StringBuilder();

        int r = 0;
        for(int i = min-1; i >= 0; i--) {
            int d1 = Integer.parseInt(big.substring(i+max-min, i+1+max-min));
            int d2 = Integer.parseInt(small.substring(i, i+1));
            int s = d1 + d2 + r;
            result.append(s % 10);
            r = s / 10;
        }

        for(int i = max-min-1; i >= 0; i--) {
            int d1 = Integer.parseInt(big.substring(i, i+1));
            int s = d1 + r;
            result.append(s % 10);
            r = s / 10;
        }

        if(r != 0) result.append(r);

        return result.reverse().toString();
    }

    public static String sub(String a, String b) {
        String big = a.length() >= b.length() ? a : b;
        String small = a.length() >= b.length() ? b : a;
        int max = big.length();
        int min = small.length();
        StringBuilder result = new StringBuilder();

        int r = 0;
        for(int i = min-1; i >= 0; i--) {
            int d1 = Integer.parseInt(big.substring(i+max-min, i+1+max-min));
            int d2 = Integer.parseInt(small.substring(i, i+1));
            int s = d1 - d2 + r;
            if(s < 0) {
                s += 10;
                r = -1;
            } else {
                r = 0;
            }
            result.append(s);
        }

        for(int i = max-min-1; i >= 0; i--) {
            int d1 = Integer.parseInt(big.substring(i, i+1));
            int s = d1 + r;
            if(s < 0) {
                s += 10;
                r = -1;
            } else {
                r = 0;
            }
            if(i != 0 || s != 0) result.append(s);
        }

        return result.reverse().toString();
    }
}
